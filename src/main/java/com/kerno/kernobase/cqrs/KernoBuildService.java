package com.kerno.kernobase.cqrs;

public interface KernoBuildService<T, E> {
    <S extends T> S buildEntity(E entityToBuild, T dtoToEdit);
}
