package com.tp_note.tp_note;

import org.apache.logging.log4j.*;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component(value="logaspect")
@Aspect
public class LogAspect {
  private final static Logger LOG = LogManager.getLogger();

  
  @After("execution( * com.tp_note.tp_note.service.impl.ClientServiceImpl.*find*(..))")
  public void logBeforeClientService() {
    LogAspect.LOG.info("Appel Client Service");
  }

  
  @After("execution( * com.tp_note.tp_note.service.impl.ConseillerServiceImpl.*find*(..))")
  public void logAfterClientService() {
    LogAspect.LOG.info("Appel Conseiller Service");
  }
}
	