
package wseduardo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSEduardoSoap", targetNamespace = "WSEduardo")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSEduardoSoap {


    /**
     * 
     * @param codigo
     * @param valor
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Ted", action = "WSEduardo/Ted")
    @WebResult(name = "TedResult", targetNamespace = "WSEduardo")
    @RequestWrapper(localName = "Ted", targetNamespace = "WSEduardo", className = "wseduardo.Ted")
    @ResponseWrapper(localName = "TedResponse", targetNamespace = "WSEduardo", className = "wseduardo.TedResponse")
    public String ted(
        @WebParam(name = "codigo", targetNamespace = "WSEduardo")
        String codigo,
        @WebParam(name = "valor", targetNamespace = "WSEduardo")
        double valor);

    /**
     * 
     * @param codigo
     * @return
     *     returns wseduardo.ObjectC
     */
    @WebMethod(operationName = "Correntista", action = "WSEduardo/Correntista")
    @WebResult(name = "CorrentistaResult", targetNamespace = "WSEduardo")
    @RequestWrapper(localName = "Correntista", targetNamespace = "WSEduardo", className = "wseduardo.Correntista")
    @ResponseWrapper(localName = "CorrentistaResponse", targetNamespace = "WSEduardo", className = "wseduardo.CorrentistaResponse")
    public ObjectC correntista(
        @WebParam(name = "codigo", targetNamespace = "WSEduardo")
        String codigo);

}
