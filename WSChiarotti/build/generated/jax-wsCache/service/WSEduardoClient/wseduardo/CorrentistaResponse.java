
package wseduardo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CorrentistaResult" type="{WSEduardo}ObjectC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "correntistaResult"
})
@XmlRootElement(name = "CorrentistaResponse")
public class CorrentistaResponse {

    @XmlElement(name = "CorrentistaResult")
    protected ObjectC correntistaResult;

    /**
     * Obtém o valor da propriedade correntistaResult.
     * 
     * @return
     *     possible object is
     *     {@link ObjectC }
     *     
     */
    public ObjectC getCorrentistaResult() {
        return correntistaResult;
    }

    /**
     * Define o valor da propriedade correntistaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectC }
     *     
     */
    public void setCorrentistaResult(ObjectC value) {
        this.correntistaResult = value;
    }

}
