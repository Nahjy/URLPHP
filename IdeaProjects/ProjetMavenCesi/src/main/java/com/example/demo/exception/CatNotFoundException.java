package com.example.demo.exception;

public class CatNotFoundException extends Exception {
        private long CatID;
        public CatNotFoundException(long CatID) {
            super(String.format("Book is not found with id : '%s'", CatID));
        }
    }