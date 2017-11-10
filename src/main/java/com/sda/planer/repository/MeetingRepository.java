package com.sda.planer.repository;

import com.sda.planer.model.Meeting;
import org.springframework.data.repository.CrudRepository;

public interface MeetingRepository extends CrudRepository<Meeting, Long> {
}
