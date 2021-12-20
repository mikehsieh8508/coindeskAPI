package cub.test.oracle.query.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cub.test.oracle.query.entity.CoinDesk;

@Repository
public interface CoinDeskRepository extends JpaRepository<CoinDesk, String>{

	/**
	 * 依幣別查詢
	 * 
	 * @param coin
	 * @return
	 */
	List<CoinDesk> findByCode(String coin);

}
