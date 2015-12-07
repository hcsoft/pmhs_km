package cn.net.tongfang.framework.security;

import cn.net.tongfang.framework.security.bo.OperatorBo;
import org.apache.cxf.service.invoker.SessionFactory;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.security.Authentication;
import org.springframework.security.AuthenticationException;
import org.springframework.security.concurrent.ConcurrentLoginException;
import org.springframework.security.providers.UsernamePasswordAuthenticationToken;
import org.springframework.security.ui.AbstractProcessingFilter;
import org.springframework.security.ui.FilterChainOrder;
import org.springframework.security.util.TextUtils;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SSOAuthFilter extends AbstractProcessingFilter   {
    private String tokenParameter = "token";
    protected SecurityService securityService;
    private String appcode;
    private String ssourl;

    public SecurityService getSecurityService() {
        return securityService;
    }

    public void setSecurityService(SecurityService securityService) {
        this.securityService = securityService;
    }

    public String getSsourl() {
        return ssourl;
    }

    public void setSsourl(String ssourl) {
        this.ssourl = ssourl;
    }

    public SSOAuthFilter() {
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    public Authentication attemptAuthentication(HttpServletRequest request) throws AuthenticationException {
        String token = request.getParameter(this.tokenParameter);

//        String getURL = "http://172.16.10.33:7006/api/CheckToken.ashx?token="+token +"&appcode="+appcode;
        String getURL = ssourl+"?token="+token +"&appcode="+appcode;
        System.out.println("getURL=="+getURL);
        String username = "";
        try {
            URL getUrl = new URL(getURL);
            HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
            connection.connect();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String lines;
            if ((lines = reader.readLine()) != null) {
                System.out.println("return======" + lines);
                if("无效密钥信息".equals(lines.substring(0,6))){
                    logger.error("单点登录验证失败:"+lines);
                    throw new ConcurrentLoginException("验证失败!");
                }else {
                    username = lines.split("_")[0];
                    System.out.println("username======" + username);
                }
            }
            reader.close();
            connection.disconnect();
        }catch (IOException ex){
            logger.error("单点登录验证失败:网络无法访问,无法验证!");
            throw new ConcurrentLoginException("网络无法访问,无法验证!");
        }

        OperatorBo operatorBo = securityService.getOperatorByUsername(username);
        String password = operatorBo.getPassword();
        if(username == null) {
            username = "";
        }

        if(password == null) {
            password = "";
        }

        username = username.trim();
        UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(username, password);
        HttpSession session = request.getSession(false);
        if(session != null || this.getAllowSessionCreation()) {
            request.getSession().setAttribute("SPRING_SECURITY_LAST_USERNAME", TextUtils.escapeEntities(username));
        }

        this.setDetails(request, authRequest);
        return this.getAuthenticationManager().authenticate(authRequest);
    }

    public String getDefaultFilterProcessesUrl() {
        return "/token";
    }

    protected void setDetails(HttpServletRequest request, UsernamePasswordAuthenticationToken authRequest) {
        authRequest.setDetails(super.authenticationDetailsSource.buildDetails(request));
    }

    public String getAppcode() {
        return appcode;
    }

    public void setAppcode(String appcode) {
        this.appcode = appcode;
    }

    public int getOrder() {
        return FilterChainOrder.AUTHENTICATION_PROCESSING_FILTER;
    }



}
