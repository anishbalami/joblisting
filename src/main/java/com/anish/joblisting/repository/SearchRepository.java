package com.anish.joblisting.repository;

import com.anish.joblisting.model.Post;

import java.util.List;

public interface SearchRepository
{
   List<Post> findByText(String text);
}
