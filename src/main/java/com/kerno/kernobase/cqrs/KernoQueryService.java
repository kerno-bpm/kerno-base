package com.kerno.kernobase.cqrs;

import java.util.List;

public interface KernoQueryService<T,ID> {
    <S extends T> S findByID(ID id);

    List<T> findAll();
}
