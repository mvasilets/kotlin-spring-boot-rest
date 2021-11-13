INSERT INTO public.roles (id, name) values (1, 'GUEST');
INSERT INTO public.roles (id, name) values (2, 'USER');
INSERT INTO public.roles (id, name) values (3, 'ADMIN');

INSERT INTO public.profiles(profile_id, first_name, last_name, age, description) values (1, 'John', 'Doe', 21, 'info');
INSERT INTO public.profiles(profile_id, first_name, last_name, age, description) values (2, 'Jane', 'Doe', 19, NULL);

INSERT INTO public.user_data(id, username, password, profile_id) values ('4bf5d2c7-cd10-446b-944b-1664c08bfb16', 'john.doe', '$2a$10$K02BhfwmmqxjIC7o4aIoD.RLDAHiQlxD.wa4uhsveZy3s2Lbw7Lra', 1);
INSERT INTO public.user_data(id, username, password, profile_id) values ('0126c30d-947e-45cc-aee8-1980fd58aafd', 'jane.doe21', '$2a$10$v7XAhrBwy5nPr8RvvATgE.k2UnfgU/YDVD4AuMR29LIeZmbJ/11DC', 2);

INSERT INTO public.user_data_roles (roles_id, user_id) values (1, '4bf5d2c7-cd10-446b-944b-1664c08bfb16');
INSERT INTO public.user_data_roles (roles_id, user_id) values (2, '4bf5d2c7-cd10-446b-944b-1664c08bfb16');
INSERT INTO public.user_data_roles (roles_id, user_id) values (1, '0126c30d-947e-45cc-aee8-1980fd58aafd');
INSERT INTO public.user_data_roles (roles_id, user_id) values (2, '0126c30d-947e-45cc-aee8-1980fd58aafd');
INSERT INTO public.user_data_roles (roles_id, user_id) values (3, '0126c30d-947e-45cc-aee8-1980fd58aafd');