package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.MyBookList;
import com.bookStore.repository.MyBookRepository;

@Service
public class MyBookListService {

	@Autowired
	private MyBookRepository myBookRepository;

	public void saveMyBooks(MyBookList book) {
		myBookRepository.save(book);
	}

	public List<MyBookList> getAllMyBooks() {
		return myBookRepository.findAll();
	}

	public void deleteById(int id) {
		myBookRepository.deleteById(id);
	}
}
