package com.ananda.raw.repository;

import com.ananda.raw.entity.Device;
import com.ananda.raw.entity.DeviceStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface DeviceRepository extends JpaRepository<Device, UUID> {

    List<Device> findByUser_Id(UUID userId);

    List<Device> findByUser_IdAndStatus(UUID userId, DeviceStatus status);
}