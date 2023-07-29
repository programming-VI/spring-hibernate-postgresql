package com.saniths.postgress.web.app.services;

import com.saniths.postgress.web.app.models.Tutorial;
import com.saniths.postgress.web.app.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TutorialServiceImpl implements TutorialService {
  @Autowired
  private TutorialRepository repository;

  @Override
  public List<Tutorial> findAll() {
    return repository.findAll();
  }

  @Override
  public Optional<Tutorial> findById(long id) {
    return repository.findById(id);
  }

  @Override
  public Tutorial save(Tutorial tutorial) {
    return repository.save(tutorial);
  }

  @Override
  public void deleteById(long id) {
    repository.deleteById(id);
  }

  @Override
  public void deleteAll() {
    repository.deleteAll();
  }

  @Override
  public List<Tutorial> findByTitleContaining(String title) {
    return repository.findByTitleContaining(title);
  }

  @Override
  public List<Tutorial> findByPublished(boolean published) {
    return repository.findByPublished(published);
  }
}
