CREATE TABLE [dbo].[BabyDeathSurvey]
(
[ID] [nvarchar] (36) COLLATE Chinese_PRC_CI_AS NOT NULL,
[FileNo] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NOT NULL,
[DBabyName] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[DBabyHospital] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[DDataOrigin] [nvarchar] (100) COLLATE Chinese_PRC_CI_AS NULL,
[DDataOriginOther] [nvarchar] (1000) COLLATE Chinese_PRC_CI_AS NULL,
[FMotherAge] [int] NULL,
[FMotherFolk] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[FMotherFolkOther] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[FMotherEducation] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[FMotherOccupation] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[FMotherLocalResidence] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[FAvgIncome] [decimal] (10, 2) NULL,
[FAddress] [nvarchar] (100) COLLATE Chinese_PRC_CI_AS NULL,
[FAddressOther] [nvarchar] (100) COLLATE Chinese_PRC_CI_AS NULL,
[MGestationTime] [int] NULL,
[MBirthTime] [int] NULL,
[MMiscarryTime] [int] NULL,
[MDeathTime] [int] NULL,
[MPrmatureTime] [int] NULL,
[MAbnormal] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[MAbnormalName] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[MHeritable] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[MHeritableName] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[MBeforeExam] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[MBeforeExamTime] [int] NULL,
[MUnBeforeExamReason] [nvarchar] (1000) COLLATE Chinese_PRC_CI_AS NULL,
[MComplication] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[MComplicationRemarks] [nvarchar] (max) COLLATE Chinese_PRC_CI_AS NULL,
[MBirthAddress] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[MBirthAddressReason] [nvarchar] (1000) COLLATE Chinese_PRC_CI_AS NULL,
[MBirthStart] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[MLeadWay] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[MLeadWayOther] [nvarchar] (1000) COLLATE Chinese_PRC_CI_AS NULL,
[MLeadSpesia] [nvarchar] (1000) COLLATE Chinese_PRC_CI_AS NULL,
[MBirthWay] [nvarchar] (100) COLLATE Chinese_PRC_CI_AS NULL,
[MHelpDoctor] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[MHelpDoctorOther] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[MBirthWeekly] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[MBirthComplication] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[MBirthComplicationRemarks] [nvarchar] (max) COLLATE Chinese_PRC_CI_AS NULL,
[BBirthday] [datetime] NULL,
[BSex] [nvarchar] (10) COLLATE Chinese_PRC_CI_AS NULL,
[BWeight] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[BWeightMeasure] [decimal] (10, 2) NULL,
[BWeightEstimate] [decimal] (10, 2) NULL,
[BFetalNum] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[BApgarOne] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[BApgarOneMinutes] [int] NULL,
[BApgarFive] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[BApgarFiveMinutes] [int] NULL,
[BSheepWater] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[BRecovery] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[BRecoveryDoctor] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[BEnvironmentTemp] [decimal] (10, 2) NULL,
[BRecovOxygen] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[BRecovVentilate] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[BRecovTrachea] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[BRecovPress] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[BRecovGland] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[BRecovOther] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[BMilk] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[BBirthMinutes] [int] NULL,
[BBirthHours] [int] NULL,
[BFeedWay] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[BFeedWayOther] [nvarchar] (100) COLLATE Chinese_PRC_CI_AS NULL,
[BSavingWay] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[BSavingWayOther] [nvarchar] (100) COLLATE Chinese_PRC_CI_AS NULL,
[ETime] [datetime] NULL,
[EHospiAndDepart] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[EIsTrans] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[ETransHospiAndDepart] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[EDealProc] [nvarchar] (max) COLLATE Chinese_PRC_CI_AS NULL,
[Diagnose] [nvarchar] (max) COLLATE Chinese_PRC_CI_AS NULL,
[CureProc] [nvarchar] (max) COLLATE Chinese_PRC_CI_AS NULL,
[BDHospiTime] [datetime] NULL,
[BDHospiAgeDay] [int] NULL,
[BDHospiAgeHour] [int] NULL,
[BDDeathTime] [datetime] NULL,
[BDDeathAgeDay] [int] NULL,
[BDDeathAgeHour] [int] NULL,
[BDAddress] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[BDAddressOther] [nvarchar] (1000) COLLATE Chinese_PRC_CI_AS NULL,
[BDDiagnose] [nvarchar] (max) COLLATE Chinese_PRC_CI_AS NULL,
[BDDissect] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[BDDiscuss] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[TUnit] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[TOptPerson] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[TDate] [datetime] NULL,
[InputPersonID] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NULL,
[InputDate] [datetime] NULL,
[ExecDistrictNum] [nvarchar] (32) COLLATE Chinese_PRC_CI_AS NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
ALTER TABLE [dbo].[BabyDeathSurvey] ADD CONSTRAINT [PK__BabyDeat__3214EC27231F2AE2] PRIMARY KEY CLUSTERED  ([ID]) ON [PRIMARY]
GO
CREATE NONCLUSTERED INDEX [IDX_BabyDeathSurvey] ON [dbo].[BabyDeathSurvey] ([FileNo]) ON [PRIMARY]
GO
