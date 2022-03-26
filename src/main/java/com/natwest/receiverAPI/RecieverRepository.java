package com.natwest.receiverAPI;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecieverRepository extends JpaRepository<Transaction,Long> {
}
