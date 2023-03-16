package com.tp_note.tp_note;

import org.apache.logging.log4j.*;
import org.aspectj.lang.*;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Component(value="logaspect")
@Aspect
public class LogAspect {
  private final static Logger LOG = LogManager.getLogger();

  @Before("execution( * com.tp_note.tp_note.data.repository.ClientRepository.findById())")
  public void logBeforeClientEntity(JoinPoint jp) {
    LogAspect.LOG.info("Appel de la fonction findById de l'entité Client");
  }

  @After("execution( * com.tp_note.tp_note.data.repository.ClientRepository.findById())")
  public void logAfterClientEntity(JoinPoint jp) {
    LogAspect.LOG.info("Appel de la fonction findById de l'entité Client");
  }
  
  @Before("execution( * com.tp_note.tp_note.data.repository.ConseillerRepository.findById())")
  public void logBeforeConseillerEntity(JoinPoint jp) {
    LogAspect.LOG.info("Appel de la fonction findById de l'entité Conseiller");
  }

  @After("execution( * com.tp_note.tp_note.data.repository.ConseillerRepository.findById())")
  public void logAfterConseillerEntity(JoinPoint jp) {
    LogAspect.LOG.info("Appel de la fonction findById de l'entité Conseiller");
  }
}
	