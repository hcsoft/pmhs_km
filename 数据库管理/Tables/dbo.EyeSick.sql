CREATE TABLE [dbo].[EyeSick]
(
[MedicalExamID] [char] (36) COLLATE Chinese_PRC_CI_AS NOT NULL,
[ID] [char] (36) COLLATE Chinese_PRC_CI_AS NOT NULL,
[EyeSickID] [int] NOT NULL CONSTRAINT [DF__EyeSick__EyeSick__3AA1AEB8] DEFAULT ((0))
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[EyeSick] ADD CONSTRAINT [pk_EyeSick1] PRIMARY KEY CLUSTERED  ([ID]) ON [PRIMARY]
GO
