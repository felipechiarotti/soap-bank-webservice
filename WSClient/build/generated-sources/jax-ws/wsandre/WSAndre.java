
package wsandre;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSAndre", targetNamespace = "http://wsandre/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSAndre {


    /**
     * 
     * @param codigo
     * @param valor
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ted", targetNamespace = "http://wsandre/", className = "wsandre.Ted")
    @ResponseWrapper(localName = "tedResponse", targetNamespace = "http://wsandre/", className = "wsandre.TedResponse")
    @Action(input = "http://wsandre/WSAndre/tedRequest", output = "http://wsandre/WSAndre/tedResponse")
    public String ted(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo,
        @WebParam(name = "valor", targetNamespace = "")
        double valor);

    /**
     * 
     * @param codigo
     * @return
     *     returns wsandre.ObjectC
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "correntista", targetNamespace = "http://wsandre/", className = "wsandre.Correntista")
    @ResponseWrapper(localName = "correntistaResponse", targetNamespace = "http://wsandre/", className = "wsandre.CorrentistaResponse")
    @Action(input = "http://wsandre/WSAndre/correntistaRequest", output = "http://wsandre/WSAndre/correntistaResponse")
    public ObjectC correntista(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo);

}
