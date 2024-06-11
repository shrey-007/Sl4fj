1) Created Logger instance using 
   ```java
     private static final Logger logger= LoggerFactory.getLogger(LoggerController.class);
   ```
   or we can directly use @Slf4j annotation of lombok and can use LOGGER instance named log. But only info, warn and error will be shown because by default only these levels are enabled
2) Created application.yml and usme configurations kari such that root package mai only error vaale logs dikhege and main package jaha saari classes hai vaha ke saare logs dikhege.
3) Created logback.xml toh ab springboot ise hi use karega application.yml ko nhi karega. Usme configurations kari jisse logs console and file dono mai dikhege