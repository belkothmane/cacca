package it.prova.prova;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("rawtypes")
public class Resources
    extends HttpServlet {

  /** The Constant serialVersionUID. */
  private static final long   serialVersionUID             = 1L;

  /** The logger. */
  private static Logger       logger                       = LoggerFactory.getLogger(Resources.class.getName());

  /** The easystore 3. */
//  private static Properties   easystore3                   = new Properties();
//
//  /** The db error prop. */
//  private static Properties   dbErrorProp                  = new Properties();

  /** The Constant PROVA_LINE. */
  private static final String PROVA_LINE              =
    "------------------------------------------------------------------------------------";

  /**
   * Instantiates a new resources.
   */
  public Resources() {
    super();
  }

  /*
   * (non-Javadoc)
   *
   * @see javax.servlet.GenericServlet#init(javax.servlet.ServletConfig)
   */

  /**
   * {@inheritDoc}
   */

  @Override
  public void init(final ServletConfig config)
      throws ServletException {

//    final String tid = Utility.getTid();

    try {
      // STARTUP

      Resources.logger.info(Resources.PROVA_LINE);
      Resources.logger.info("|               L O A D I N G      R E S O U R C E S                        |");
      Resources.logger.info(Resources.PROVA_LINE);

      // LOADING PROPERTIES
//      Resources.logger.info("LOADING  EASYSTORE3 PROPERTIES ");

//      try (InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(Resources.EASYSTORE3_PROPERTIES)) {
//        Resources.easystore3.load(inputStream);
//        inputStream.close();
//        Resources.logger.info("EASYSTORE3 PROPERTIES LOADED");
//      }

//      Resources.logger.info("LOADING DBERROR PROPERTIES ");
//      try (InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(Resources.EASYSTORE3_ERRORS_PROPERTIES)) {
//        Resources.dbErrorProp.load(inputStream);
//        inputStream.close();
//        Resources.logger.info("DBERROR PROPERTIES LOADED");
//      }

      // STARTUP OK
      Resources.logger.info(Resources.PROVA_LINE);
      Resources.logger.info("|       PROVA BELKA BISO   R E S O U R C E S   L O A D E D   S U C C E S S F U L L Y        |");
      Resources.logger.info(Resources.PROVA_LINE);

    } catch (final Exception e) {
      Resources.logger.error(" Resource Servlet Init failed " + e.getMessage(), e);
      // STARTUP KO
      Resources.logger.info(Resources.PROVA_LINE);
      Resources.logger.info("|            PROVA BELKA BISO   R E S O U R C E S   L O A D I N G   F A I L E D            |");
      Resources.logger.info(Resources.PROVA_LINE);
    }

  }

//  /**
//   * Gets the erro description.
//   *
//   * @param errorCode
//   *          the error code
//   * @return the erro description
//   */
//  public static String getErroDescription(final int errorCode) {
//    final String key = "error." + errorCode;
//    String result = Resources.dbErrorProp.getProperty(key);
//
//    try {
//      result = new String(result.getBytes(), "UTF-8");
//    } catch (final UnsupportedEncodingException e) {
//      Resources.logger.warn("Error: ", e);
//      // non faccio nulla, rimane l'encoding originale
//    }
//    return result;
//  }
//
//  /**
//   * Gets the easy 3 property.
//   *
//   * @param key
//   *          the key
//   * @return the easy 3 property
//   */
//  public static String getEasy3Property(final String key) {
//    return Resources.easystore3.getProperty(key);
//  }

}