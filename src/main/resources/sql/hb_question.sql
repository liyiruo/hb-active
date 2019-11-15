-- Create table
create table HB_QUESTION
(
  ACTIVE_ID      VARCHAR2(20) not null,
  QUESTION_ID    VARCHAR2(20) not null,
  QUESTTION_DESC VARCHAR2(500),
  CREATE_DATE    DATE,
  UPDATE_DATE    DATE,
  TEMP           VARCHAR2(4000)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Add comments to the table
comment on table HB_QUESTION
  is '问题表';
-- Add comments to the columns
comment on column HB_QUESTION.ACTIVE_ID
  is '活动ID';
comment on column HB_QUESTION.QUESTION_ID
  is '问题ID';
comment on column HB_QUESTION.QUESTTION_DESC
  is '问题描述';
comment on column HB_QUESTION.CREATE_DATE
  is '创建时间';
comment on column HB_QUESTION.UPDATE_DATE
  is '修改时间';
comment on column HB_QUESTION.TEMP
  is '备用字段';
-- Create/Recreate primary, unique and foreign key constraints
alter table HB_QUESTION
  add constraint PK_HB_QUESTION primary key (ACTIVE_ID, QUESTION_ID)
  using index
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
