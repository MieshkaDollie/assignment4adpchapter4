package softwaredesignprinciples;

public class SingleResponsabilityPrincipleGood {
}

// single responsibility principle - good example
interface IEmail2 {
    public void setSender(String sender);
    public void setReceiver(String receiver);
    public void setContent(IContent content);
}

interface IContent {
    public String getAsString(); // used for serialization
}

class Email2 implements IEmail2 {
    public void setSender(String sender) {// set sender;
         }
        public void setReceiver(String receiver) {// set receiver;
             }
            public void setContent(IContent content) {// set content;
         }
            }
