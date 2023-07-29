package com.saniths.postgress.web.app.services;

import com.saniths.postgress.web.app.models.Tutorial;

import java.util.List;
import java.util.Optional;

public interface TutorialService {
  List<Tutorial> findAll();

  Optional<Tutorial> findById(long id);

  Tutorial save(Tutorial tutorial);

  void deleteById(long id);

  void deleteAll();

  List<Tutorial> findByTitleContaining(String title);

  List<Tutorial> findByPublished(boolean published);

}
