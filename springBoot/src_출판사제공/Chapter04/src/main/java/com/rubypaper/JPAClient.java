package com.rubypaper;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.rubypaper.domain.Board;

public class JPAClient {
	public static void main(String[] args) {
		// EntityManager 생성
		EntityManagerFactory emf = 
Persistence.createEntityManagerFactory("Chapter04");
		EntityManager em = emf.createEntityManager();
		
		// Transaction 생성
		EntityTransaction tx = em.getTransaction();
		
		try {
			// Transaction 시작
			tx.begin();

			// 수정할 게시글 조회
			Board board = em.find(Board.class, 1L);
			board.setTitle("검색한 게시글의 제목 수정");
		
			// Transaction commit
			tx.commit();	

		} catch (Exception e) {
			e.printStackTrace();			
			// Transaction rollback
			tx.rollback();
		} finally {
			em.close();
			emf.close();
		}		
	}
}
