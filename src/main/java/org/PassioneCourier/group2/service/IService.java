package org.PassioneCourier.group2.service;

public interface IService <Type, ID> {

    Type create(Type x);
    Type read(String ID);
    Type update(Type x, String ID);
    boolean delete(String ID);

}
