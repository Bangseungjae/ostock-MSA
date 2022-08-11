package com.optimagrowth.license.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.hateoas.RepresentationModel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@RedisHash
public class Organization extends RepresentationModel<Organization> implements Serializable {

    @Id
    String id;
    String name;
    String contactName;
    String contactEmail;
    String contactPhone;

}