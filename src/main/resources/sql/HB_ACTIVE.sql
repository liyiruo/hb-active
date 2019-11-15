-- Create table
create table HB_ACTIVE
(
  ACTIVE_ID   VARCHAR2(20) not null,
  ACTIVE_NAME VARCHAR2(200),
  ACTIVE_DESC VARCHAR2(4000),
  CREATE_DATE DATE,
  UPDATE_DATE DATE
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
comment on table HB_ACTIVE
  is '活动表';
-- Add comments to the columns
comment on column HB_ACTIVE.ACTIVE_ID
  is '活动ID';
comment on column HB_ACTIVE.ACTIVE_NAME
  is '活动名称';
comment on column HB_ACTIVE.ACTIVE_DESC
  is '活动描述';
comment on column HB_ACTIVE.CREATE_DATE
  is '创建时间';
comment on column HB_ACTIVE.UPDATE_DATE
  is '修改时间';