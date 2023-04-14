package com.freetech.products.productservice.application.enums;

import lombok.Getter;

@Getter
public enum ExceptionEnum {
    ERROR_CREATE_PRODUCT("50001", "Error creating product"),
    ERROR_UPDATE_PRODUCT("50002", "Error updating product"),
    ERROR_NOT_FOUND_PRODUCT("50004", "Product not found");

    private String code;
    private String message;

    ExceptionEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
