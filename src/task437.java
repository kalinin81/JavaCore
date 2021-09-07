//почтовая система

public class task437 {

    // твой код здесь
//    public static class UntrustworthyMailWorker implements MailService {
//        private RealMailService realMailService;
//        private MailService[] mailServices;
//        public UntrustworthyMailWorker(MailService[] mailServices) {
//            this.mailServices = mailSevices;
//            RealMailService realMailService = new RealMailService();
//        }
//        public RealMailService getRealMailService() {
//            return realMailService;
//        }
//        @Override
//        public Sendable processMail(Sendable mail) {
//            for (MailService mailService: mailServices) {
//                mail = mailService.processMail(mail);
//            }
//            return realMailService.processMail(mail);
//        }
//    }
//
//    public static class Spy {
//        private static final Logger LOGGER = Logger.getLogger(Spy.class.getName());
//        public Sendable processMail(Sendable mail) {
//            if (!mail instanceof MailMessage) {
//                return;
//            }
//            if (AUSTIN_POWERS.equals(mail.getFrom()) || AUSTIN_POWERS.equals(mail.getTo())) {
//                LOGGER.log(LEVEL.WARNING,"Detected target mail correspondence: from {from} to {to} \"{message}\"", new Object[] {mail.getFrom(),mail.getTo(),mail.getMessage()});
//            } else {
//                LOGGER.log(LEVEL.INFO,"Usual correspondence: from {from} to {to}", new Object[] {mail.getFrom(),mail.getTo()});
//            }
//            return mail;
//        }
//
//    }
}
