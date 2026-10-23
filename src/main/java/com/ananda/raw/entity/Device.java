package com.ananda.raw.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.UuidGenerator;

import java.time.Instant;
import java.util.UUID;


@Entity
@Table(name ="devices")

public class Device {


    @Id
    @UuidGenerator
    @Column(name = "device_id")
    private UUID deviceId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
     private User user;

    public Device(User user, String deviceName, String identityPublicKey) {


        this.user = user;
        this.deviceName = deviceName;
        this.identityPublicKey = identityPublicKey;
        this.status = DeviceStatus.ACTIVE;
        this.createdAt = Instant.now();
        this.revokedAt = null;
    }
protected  Device(){

}
    @NotBlank
    @Column(nullable = false)
    private String deviceName;

    @Column(name = "identity_public_key", nullable = false)
    private String identityPublicKey;
    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DeviceStatus status;
    @Column(nullable = false)
    private Instant createdAt;
    @Column(nullable = true)
    private Instant revokedAt;

}