//SUPERPOWER SERVICE
package com.example.bootcamp.service;

import com.example.bootcamp.model.Superpower;
import com.example.bootcamp.repository.SuperpowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SuperpowerService implements SuperpowerRepository{

    @Autowired
    SuperpowerRepository superpowerRepo;


    @Override
    public List<Superpower> findAll() {
        return superpowerRepo.findAll();
    }

    @Override
    public List<Superpower> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Superpower> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Superpower> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Superpower entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Superpower> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Superpower> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Superpower> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Superpower> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Superpower> S saveAndFlush(S entity) {
        return null;
    }

    public <S extends Superpower> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Superpower> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Superpower getOne(Long aLong) {
        return null;
    }

    @Override
    public Superpower getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Superpower> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Superpower> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Superpower> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Superpower> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Superpower> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Superpower> boolean exists(Example<S> example) {
        return false;
    }
}
