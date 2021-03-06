CREATE TABLE [dbo].[BabyVisit]
(
[ID] [char] (36) COLLATE Chinese_PRC_CI_AS NOT NULL,
[FileNo] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NOT NULL,
[Sex] [nvarchar] (10) COLLATE Chinese_PRC_CI_AS NULL,
[Birthday] [datetime] NULL,
[IDCardNum] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[Address] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[FName] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[FOccupation] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[FPhone] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[FBirthday] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[MName] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[MOccupation] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[MPhone] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[MBirthday] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[GestationalWeeks] [nvarchar] (10) COLLATE Chinese_PRC_CI_AS NULL,
[PregnantSickOther] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NULL,
[HospitalName] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NULL,
[BornStatusOther] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NULL,
[Sleepy] [nvarchar] (10) COLLATE Chinese_PRC_CI_AS NULL,
[SleepyState] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[Monster] [nvarchar] (10) COLLATE Chinese_PRC_CI_AS NULL,
[MonsterOther] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NULL,
[Exam01] [nvarchar] (10) COLLATE Chinese_PRC_CI_AS NULL,
[Exam02] [decimal] (10, 2) NULL,
[Exam03] [decimal] (10, 2) NULL,
[Exam04] [nvarchar] (10) COLLATE Chinese_PRC_CI_AS NULL,
[Exam05] [decimal] (10, 2) NULL,
[Exam06] [int] NULL,
[Exam07] [int] NULL,
[FaceColorOther] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[Exam09] [decimal] (10, 2) NULL,
[Exam10] [decimal] (10, 2) NULL,
[Exam11] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[FrontSkullOther] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NULL,
[Exam12] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[Exam12Other] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NULL,
[Exam13] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[Exam13Other] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NULL,
[Exam14] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[Exam14Other] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NULL,
[Exam15] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[Exam15Other] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NULL,
[Exam16] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[Exam16Other] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NULL,
[Exam17] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[Exam17Other] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NULL,
[Exam18] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[Exam18Other] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NULL,
[Exam19] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[Exam19Other] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NULL,
[Exam20] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[Exam20Other] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NULL,
[SkinOther] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NULL,
[Exam22] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[Exam22Other] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NULL,
[Exam23] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[Exam23Other] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NULL,
[Exam24] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[Exam24Other] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NULL,
[Exam25] [bit] NULL,
[Exam26] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NULL,
[Exam27] [nvarchar] (50) COLLATE Chinese_PRC_CI_AS NULL,
[Direct] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[VisitDate] [datetime] NULL,
[NextVisitPlace] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[NextVisitDate] [datetime] NULL,
[VisitDoctor] [nvarchar] (10) COLLATE Chinese_PRC_CI_AS NULL,
[InputPersonID] [nvarchar] (30) COLLATE Chinese_PRC_CI_AS NULL,
[InputDate] [datetime] NULL,
[Exam28] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[Exam28Other] [nvarchar] (100) COLLATE Chinese_PRC_CI_AS NULL,
[Exam29] [decimal] (10, 2) NULL,
[Exam30] [decimal] (10, 2) NULL,
[Exam31] [int] NULL,
[Exam32] [bit] NULL,
[Exam33] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[Exam34] [int] NULL,
[Exam35] [nvarchar] (20) COLLATE Chinese_PRC_CI_AS NULL,
[High_Risk] [nvarchar] (2) COLLATE Chinese_PRC_CI_AS NULL,
[High_Risk_Remark] [nvarchar] (1000) COLLATE Chinese_PRC_CI_AS NULL,
[ExecDistrictNum] [nvarchar] (32) COLLATE Chinese_PRC_CI_AS NULL,
[HighRiskSearch] [nvarchar] (100) COLLATE Chinese_PRC_CI_AS NULL,
[ForeignId] [nvarchar] (36) COLLATE Chinese_PRC_CI_AS NULL
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[BabyVisit] ADD CONSTRAINT [pk_BabyVisit] PRIMARY KEY CLUSTERED  ([ID]) ON [PRIMARY]
GO
CREATE NONCLUSTERED INDEX [pmhs_babyVisit] ON [dbo].[BabyVisit] ([FileNo]) ON [PRIMARY]
GO
