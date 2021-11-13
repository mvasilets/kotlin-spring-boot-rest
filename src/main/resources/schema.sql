-- drop old tables
drop table if exists user_data_roles;
drop table if exists roles;
drop table if exists user_data;
drop table if exists profiles;

CREATE TABLE IF NOT EXISTS public.user_data (
  profile_id integer NULL,
  username character varying(255) NULL,
  password character varying(255) NULL,
  id uuid NOT NULL
);
ALTER TABLE
  public.user_data
ADD
  CONSTRAINT user_data_pkey PRIMARY KEY (id);

CREATE TABLE IF NOT EXISTS public.user_data_roles (roles_id integer NOT NULL, user_id uuid NOT NULL);

CREATE TABLE public.roles (name character varying(255) NULL, id integer NOT NULL);
ALTER TABLE
  public.roles
ADD
  CONSTRAINT roles_pkey PRIMARY KEY (id);

CREATE TABLE IF NOT EXISTS public.profiles (
  last_name character varying(255) NULL,
  first_name character varying(255) NULL,
  description character varying(255) NULL,
  age integer NOT NULL,
  profile_id integer NOT NULL
);
ALTER TABLE
  public.profiles
ADD
  CONSTRAINT profiles_pkey PRIMARY KEY (profile_id);