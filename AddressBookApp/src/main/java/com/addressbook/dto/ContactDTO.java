package com.addressbook.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactDTO {
    @NotEmpty
    @Pattern(regexp = "^[A-Z][a-zA-Z]{2,}$")
    String name;
    String email;
    String phone;
}
