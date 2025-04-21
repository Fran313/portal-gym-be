package com.portal.portal_gym_be.dtos;

import lombok.Builder;

@Builder
public record RUser(Long id, String name, String surname, String email, Boolean payToDate) {}
