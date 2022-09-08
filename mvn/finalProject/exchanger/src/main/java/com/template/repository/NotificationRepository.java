package com.template.repository;

import com.template.entity.Notification;
import com.template.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

    Notification findByUserId(Long id);

}
