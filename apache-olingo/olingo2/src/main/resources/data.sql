insert into shipping_slip(slipkey,account,orderkey,ecordernum) values('1','Testunit','1111','0000000001KR');
insert into shipping_slip(slipkey,account,orderkey,ecordernum) values('2','Testunit','2222','0000000001ME');

insert into delivery_note(deliveryid,slipkey,createddate) values('1d','1','2021-11-09 21:30:00.000');
insert into delivery_note(deliveryid,slipkey,createddate) values('1d','1','2021-11-09 12:30:00.000');

insert into delivery_note(deliveryid,slipkey,createddate) values('2d','2','2021-11-09 11:30:00.000');
insert into delivery_note(deliveryid,slipkey,createddate) values('2d','2','2021-11-09 15:30:00.000');
insert into delivery_note(deliveryid,slipkey,createddate) values('2d','2','2021-11-09 12:30:00.000');


insert into delivery_note(deliveryid,slipkey,createddate) values('1d','1','2021-11-09 21:30:00');
insert into delivery_note_detail(deliveryid,binarydata) values('1d','MQ==');
insert into delivery_note_detail(deliveryid,binarydata) values('2d','Mg==');

alter sequence hibernate_sequence restart with 100;