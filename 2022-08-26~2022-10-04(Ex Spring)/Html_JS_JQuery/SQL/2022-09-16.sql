use study;

drop table TBOARD_FILE;

CREATE TABLE TBOARD_FILE
(
    FIDX       INT AUTO_INCREMENT,
    FBOARD_IDX INT          NOT NULL COMMENT ' 게시판 테이블의 P/K를 F/K로',
    FFILENAME  NVARCHAR(20) NOT NULL COMMENT ' 파일 이름',
    FSVAEFILE  NVARCHAR(50) NOT NULL COMMENT ' 저장된 파일의 경로 및 파일명',
    FFILESIZE  INT          NOT NULL COMMENT '파일 용량',
    FDOWNCNT   INT          NOT NULL COMMENT '파일 다운로드 수' DEFAULT 0,
    PRIMARY KEY (FIDX)
) COMMENT = '게시판 첨부파일 테이블';

INSERT INTO TBOARD_FILE(FBOARD_IDX, FFILENAME, FSVAEFILE, FFILESIZE)
VALUES ('1','A.txt','A/A1.txt','1024'),
       ('2','B.exe','A/B.exe','3000'),
       ('2','C.ppt','A/C.ppt','2048'),
       ('3','D.jsp','D/D2.jsp','3072'),
       ('4','E.sql','D/E.sql','4096'),
       ('5','F.js','C/F.js','8000'),
       ('8','G.html','C/G2.html','10248765'),
       ('9','H.css','C/H123','23452345');

select * from tboard a
                  left join tboard_file tf on a.FIDX = tf.FIDX
where a.FIDX = 8;

desc tboard;

select a.Fidx AIDX,a.FNAME,FSUBJECT,count(B.fidx) FCOMMENTCNT,COUNT(B.FIDX) FFILECNT from tboard a
                                                                                              left join tboard_file b on a.FIDX = b.FBOARD_IDX
                                                                                              left join tboard_comment c on a.FIDX = c.FBOARD_IDX
where a.FIDX>3
GROUP BY a.Fidx
HAVING FFILECNT>0
ORDER BY a.FGROUP desc, a.FSTEP desc;



