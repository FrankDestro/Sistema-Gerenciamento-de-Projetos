package com.management.project_managment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.project_managment.entities.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long>{

}
