create table if not exists product_control_group(
product_control_code Integer not null,
frtb_effective Integer null,
frtb_effective_date varchar(255) null,
frtbproduct_control_desc varchar(255) null,
frtbproduct_control_short_desc varchar(255) null,
frtb_decimal_positions Integer null,
frtbproduct_control_symbol varchar(255) null,
frtbproduct_control_scale varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint product_control_group_pk primary key(product_control_code));