create database rumahsakit;
create table tbl_pasien (
	id_pasien int primary key auto_increment,
    nama_pasien varchar(255),
    jenis_kelamin_pasien char(1),
    tgl_lahir_pasien date,
    alamat_pasien text
);

## create
insert into tbl_pasien (nama_pasien, jenis_kelamin_pasien, tgl_lahir_pasien, alamat_pasien) values("Budi","L","2026-04-24","Wonosobo");

## read
select * from tbl_pasien;