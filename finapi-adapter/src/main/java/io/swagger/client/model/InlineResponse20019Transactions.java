/*
 * finAPI RESTful Services
 * finAPI RESTful Services
 *
 * OpenAPI spec version: v1.20.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.InlineResponse20012Labels;
import io.swagger.client.model.InlineResponse2008Categories;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Container for a transaction&#39;s data
 */
@ApiModel(description = "Container for a transaction's data")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T14:26:47.047Z")
public class InlineResponse20019Transactions {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("parentId")
  private Long parentId = null;

  @SerializedName("accountId")
  private Long accountId = null;

  @SerializedName("valueDate")
  private String valueDate = null;

  @SerializedName("bankBookingDate")
  private String bankBookingDate = null;

  @SerializedName("finapiBookingDate")
  private String finapiBookingDate = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("purpose")
  private String purpose = null;

  @SerializedName("counterpartName")
  private String counterpartName = null;

  @SerializedName("counterpartAccountNumber")
  private String counterpartAccountNumber = null;

  @SerializedName("counterpartIban")
  private String counterpartIban = null;

  @SerializedName("counterpartBlz")
  private String counterpartBlz = null;

  @SerializedName("counterpartBic")
  private String counterpartBic = null;

  @SerializedName("counterpartBankName")
  private String counterpartBankName = null;

  @SerializedName("counterpartMandateReference")
  private String counterpartMandateReference = null;

  @SerializedName("counterpartCustomerReference")
  private String counterpartCustomerReference = null;

  @SerializedName("counterpartCreditorId")
  private String counterpartCreditorId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("typeCodeZka")
  private String typeCodeZka = null;

  @SerializedName("typeCodeSwift")
  private String typeCodeSwift = null;

  @SerializedName("primanota")
  private String primanota = null;

  @SerializedName("category")
  private InlineResponse2008Categories category = null;

  @SerializedName("labels")
  private List<InlineResponse20012Labels> labels = new ArrayList<InlineResponse20012Labels>();

  @SerializedName("isPotentialDuplicate")
  private Boolean isPotentialDuplicate = false;

  @SerializedName("isNew")
  private Boolean isNew = false;

  @SerializedName("importDate")
  private String importDate = null;

  @SerializedName("children")
  private List<Long> children = new ArrayList<Long>();

  public InlineResponse20019Transactions id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Transaction identifier
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "Transaction identifier")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public InlineResponse20019Transactions parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Parent transaction identifier
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "Parent transaction identifier")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public InlineResponse20019Transactions accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Account identifier
   * @return accountId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Account identifier")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public InlineResponse20019Transactions valueDate(String valueDate) {
    this.valueDate = valueDate;
    return this;
  }

   /**
   * Value date in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time).
   * @return valueDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "Value date in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time).")
  public String getValueDate() {
    return valueDate;
  }

  public void setValueDate(String valueDate) {
    this.valueDate = valueDate;
  }

  public InlineResponse20019Transactions bankBookingDate(String bankBookingDate) {
    this.bankBookingDate = bankBookingDate;
    return this;
  }

   /**
   * Bank booking date in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time).
   * @return bankBookingDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "Bank booking date in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time).")
  public String getBankBookingDate() {
    return bankBookingDate;
  }

  public void setBankBookingDate(String bankBookingDate) {
    this.bankBookingDate = bankBookingDate;
  }

  public InlineResponse20019Transactions finapiBookingDate(String finapiBookingDate) {
    this.finapiBookingDate = finapiBookingDate;
    return this;
  }

   /**
   * finAPI Booking date in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time). NOTE: In some cases, banks may deliver transactions that are booked in future, but already included in the current account balance. To keep the account balance consistent with the set of transactions, such \"future transactions\" will be imported with their finapiBookingDate set to the current date (i.e.: date of import). The finapiBookingDate will automatically get adjusted towards the bankBookingDate each time the associated bank account is updated. Example: A transaction is imported on July, 3rd, with a bank reported booking date of July, 6th. The transaction will be imported with its finapiBookingDate set to July, 3rd. Then, on July 4th, the associated account is updated. During this update, the transaction's finapiBookingDate will be automatically adjusted to July 4th. This adjustment of the finapiBookingDate takes place on each update until the bank account is updated on July 6th or later, in which case the transaction's finapiBookingDate will be adjusted to its final value, July 6th.<br> The finapiBookingDate is the date that is used by the finAPI PFM services. E.g. when you calculate the spendings of an account for the current month, and have a transaction with finapiBookingDate in the current month but bankBookingDate at the beginning of the next month, then this transaction is included in the calculations (as the bank has this transaction's amount included in the current account balance as well).
   * @return finapiBookingDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "finAPI Booking date in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time). NOTE: In some cases, banks may deliver transactions that are booked in future, but already included in the current account balance. To keep the account balance consistent with the set of transactions, such \"future transactions\" will be imported with their finapiBookingDate set to the current date (i.e.: date of import). The finapiBookingDate will automatically get adjusted towards the bankBookingDate each time the associated bank account is updated. Example: A transaction is imported on July, 3rd, with a bank reported booking date of July, 6th. The transaction will be imported with its finapiBookingDate set to July, 3rd. Then, on July 4th, the associated account is updated. During this update, the transaction's finapiBookingDate will be automatically adjusted to July 4th. This adjustment of the finapiBookingDate takes place on each update until the bank account is updated on July 6th or later, in which case the transaction's finapiBookingDate will be adjusted to its final value, July 6th.<br> The finapiBookingDate is the date that is used by the finAPI PFM services. E.g. when you calculate the spendings of an account for the current month, and have a transaction with finapiBookingDate in the current month but bankBookingDate at the beginning of the next month, then this transaction is included in the calculations (as the bank has this transaction's amount included in the current account balance as well).")
  public String getFinapiBookingDate() {
    return finapiBookingDate;
  }

  public void setFinapiBookingDate(String finapiBookingDate) {
    this.finapiBookingDate = finapiBookingDate;
  }

  public InlineResponse20019Transactions amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Transaction amount
   * @return amount
  **/
  @ApiModelProperty(example = "null", required = true, value = "Transaction amount")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public InlineResponse20019Transactions purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * Transaction purpose
   * @return purpose
  **/
  @ApiModelProperty(example = "null", value = "Transaction purpose")
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public InlineResponse20019Transactions counterpartName(String counterpartName) {
    this.counterpartName = counterpartName;
    return this;
  }

   /**
   * Counterpart name
   * @return counterpartName
  **/
  @ApiModelProperty(example = "null", value = "Counterpart name")
  public String getCounterpartName() {
    return counterpartName;
  }

  public void setCounterpartName(String counterpartName) {
    this.counterpartName = counterpartName;
  }

  public InlineResponse20019Transactions counterpartAccountNumber(String counterpartAccountNumber) {
    this.counterpartAccountNumber = counterpartAccountNumber;
    return this;
  }

   /**
   * Counterpart account number
   * @return counterpartAccountNumber
  **/
  @ApiModelProperty(example = "null", value = "Counterpart account number")
  public String getCounterpartAccountNumber() {
    return counterpartAccountNumber;
  }

  public void setCounterpartAccountNumber(String counterpartAccountNumber) {
    this.counterpartAccountNumber = counterpartAccountNumber;
  }

  public InlineResponse20019Transactions counterpartIban(String counterpartIban) {
    this.counterpartIban = counterpartIban;
    return this;
  }

   /**
   * Counterpart IBAN
   * @return counterpartIban
  **/
  @ApiModelProperty(example = "null", value = "Counterpart IBAN")
  public String getCounterpartIban() {
    return counterpartIban;
  }

  public void setCounterpartIban(String counterpartIban) {
    this.counterpartIban = counterpartIban;
  }

  public InlineResponse20019Transactions counterpartBlz(String counterpartBlz) {
    this.counterpartBlz = counterpartBlz;
    return this;
  }

   /**
   * Counterpart BLZ
   * @return counterpartBlz
  **/
  @ApiModelProperty(example = "null", value = "Counterpart BLZ")
  public String getCounterpartBlz() {
    return counterpartBlz;
  }

  public void setCounterpartBlz(String counterpartBlz) {
    this.counterpartBlz = counterpartBlz;
  }

  public InlineResponse20019Transactions counterpartBic(String counterpartBic) {
    this.counterpartBic = counterpartBic;
    return this;
  }

   /**
   * Counterpart BIC
   * @return counterpartBic
  **/
  @ApiModelProperty(example = "null", value = "Counterpart BIC")
  public String getCounterpartBic() {
    return counterpartBic;
  }

  public void setCounterpartBic(String counterpartBic) {
    this.counterpartBic = counterpartBic;
  }

  public InlineResponse20019Transactions counterpartBankName(String counterpartBankName) {
    this.counterpartBankName = counterpartBankName;
    return this;
  }

   /**
   * Counterpart Bank name
   * @return counterpartBankName
  **/
  @ApiModelProperty(example = "null", value = "Counterpart Bank name")
  public String getCounterpartBankName() {
    return counterpartBankName;
  }

  public void setCounterpartBankName(String counterpartBankName) {
    this.counterpartBankName = counterpartBankName;
  }

  public InlineResponse20019Transactions counterpartMandateReference(String counterpartMandateReference) {
    this.counterpartMandateReference = counterpartMandateReference;
    return this;
  }

   /**
   * The mandate reference of the counterpart
   * @return counterpartMandateReference
  **/
  @ApiModelProperty(example = "null", value = "The mandate reference of the counterpart")
  public String getCounterpartMandateReference() {
    return counterpartMandateReference;
  }

  public void setCounterpartMandateReference(String counterpartMandateReference) {
    this.counterpartMandateReference = counterpartMandateReference;
  }

  public InlineResponse20019Transactions counterpartCustomerReference(String counterpartCustomerReference) {
    this.counterpartCustomerReference = counterpartCustomerReference;
    return this;
  }

   /**
   * The customer reference of the counterpart
   * @return counterpartCustomerReference
  **/
  @ApiModelProperty(example = "null", value = "The customer reference of the counterpart")
  public String getCounterpartCustomerReference() {
    return counterpartCustomerReference;
  }

  public void setCounterpartCustomerReference(String counterpartCustomerReference) {
    this.counterpartCustomerReference = counterpartCustomerReference;
  }

  public InlineResponse20019Transactions counterpartCreditorId(String counterpartCreditorId) {
    this.counterpartCreditorId = counterpartCreditorId;
    return this;
  }

   /**
   * The creditor ID of the counterpart
   * @return counterpartCreditorId
  **/
  @ApiModelProperty(example = "null", value = "The creditor ID of the counterpart")
  public String getCounterpartCreditorId() {
    return counterpartCreditorId;
  }

  public void setCounterpartCreditorId(String counterpartCreditorId) {
    this.counterpartCreditorId = counterpartCreditorId;
  }

  public InlineResponse20019Transactions type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Transaction type, according to the bank. If set, this will contain a German term that you can display to the user. Some examples of common values are: \"Lastschrift\", \"Auslands&uuml;berweisung\", \"Geb&uuml;hren\", \"Zinsen\". The maximum possible length of this field is 255 characters.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Transaction type, according to the bank. If set, this will contain a German term that you can display to the user. Some examples of common values are: \"Lastschrift\", \"Auslands&uuml;berweisung\", \"Geb&uuml;hren\", \"Zinsen\". The maximum possible length of this field is 255 characters.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public InlineResponse20019Transactions typeCodeZka(String typeCodeZka) {
    this.typeCodeZka = typeCodeZka;
    return this;
  }

   /**
   * ZKA business transaction code which relates to the transaction's type. Possible values range from 1 through 999. If no information about the ZKA type code is available, then this field will be null.
   * @return typeCodeZka
  **/
  @ApiModelProperty(example = "null", value = "ZKA business transaction code which relates to the transaction's type. Possible values range from 1 through 999. If no information about the ZKA type code is available, then this field will be null.")
  public String getTypeCodeZka() {
    return typeCodeZka;
  }

  public void setTypeCodeZka(String typeCodeZka) {
    this.typeCodeZka = typeCodeZka;
  }

  public InlineResponse20019Transactions typeCodeSwift(String typeCodeSwift) {
    this.typeCodeSwift = typeCodeSwift;
    return this;
  }

   /**
   * SWIFT transaction type code. If no information about the SWIFT code is available, then this field will be null.
   * @return typeCodeSwift
  **/
  @ApiModelProperty(example = "null", value = "SWIFT transaction type code. If no information about the SWIFT code is available, then this field will be null.")
  public String getTypeCodeSwift() {
    return typeCodeSwift;
  }

  public void setTypeCodeSwift(String typeCodeSwift) {
    this.typeCodeSwift = typeCodeSwift;
  }

  public InlineResponse20019Transactions primanota(String primanota) {
    this.primanota = primanota;
    return this;
  }

   /**
   * Transaction primanota (bank side identification number)
   * @return primanota
  **/
  @ApiModelProperty(example = "null", value = "Transaction primanota (bank side identification number)")
  public String getPrimanota() {
    return primanota;
  }

  public void setPrimanota(String primanota) {
    this.primanota = primanota;
  }

  public InlineResponse20019Transactions category(InlineResponse2008Categories category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(example = "null", value = "")
  public InlineResponse2008Categories getCategory() {
    return category;
  }

  public void setCategory(InlineResponse2008Categories category) {
    this.category = category;
  }

  public InlineResponse20019Transactions labels(List<InlineResponse20012Labels> labels) {
    this.labels = labels;
    return this;
  }

  public InlineResponse20019Transactions addLabelsItem(InlineResponse20012Labels labelsItem) {
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Array of assigned labels
   * @return labels
  **/
  @ApiModelProperty(example = "null", value = "Array of assigned labels")
  public List<InlineResponse20012Labels> getLabels() {
    return labels;
  }

  public void setLabels(List<InlineResponse20012Labels> labels) {
    this.labels = labels;
  }

  public InlineResponse20019Transactions isPotentialDuplicate(Boolean isPotentialDuplicate) {
    this.isPotentialDuplicate = isPotentialDuplicate;
    return this;
  }

   /**
   * While finAPI uses a well-elaborated algorithm for uniquely identifying transactions, there is still the possibility that during an account update, a transaction that was imported previously may be imported a second time as a new transaction. For example, this can happen if some transaction data changes on the bank server side. However, finAPI also includes an algorithm of identifying such \"potential duplicate\" transactions. If this field is set to true, it means that finAPI detected a similar transaction that might actually be the same. It is recommended to communicate this information to the end user, and give him an option to delete the transaction in case he confirms that it really is a duplicate.
   * @return isPotentialDuplicate
  **/
  @ApiModelProperty(example = "null", required = true, value = "While finAPI uses a well-elaborated algorithm for uniquely identifying transactions, there is still the possibility that during an account update, a transaction that was imported previously may be imported a second time as a new transaction. For example, this can happen if some transaction data changes on the bank server side. However, finAPI also includes an algorithm of identifying such \"potential duplicate\" transactions. If this field is set to true, it means that finAPI detected a similar transaction that might actually be the same. It is recommended to communicate this information to the end user, and give him an option to delete the transaction in case he confirms that it really is a duplicate.")
  public Boolean getIsPotentialDuplicate() {
    return isPotentialDuplicate;
  }

  public void setIsPotentialDuplicate(Boolean isPotentialDuplicate) {
    this.isPotentialDuplicate = isPotentialDuplicate;
  }

  public InlineResponse20019Transactions isNew(Boolean isNew) {
    this.isNew = isNew;
    return this;
  }

   /**
   * Indicating whether this transaction is 'new' or not. Any newly imported transaction will have this flag initially set to true. How you use this field is up to your interpretation. For example, you might want to set it to false once a user has clicked on/seen the transaction. You can change this flag to 'false' with the PATCH method.
   * @return isNew
  **/
  @ApiModelProperty(example = "null", required = true, value = "Indicating whether this transaction is 'new' or not. Any newly imported transaction will have this flag initially set to true. How you use this field is up to your interpretation. For example, you might want to set it to false once a user has clicked on/seen the transaction. You can change this flag to 'false' with the PATCH method.")
  public Boolean getIsNew() {
    return isNew;
  }

  public void setIsNew(Boolean isNew) {
    this.isNew = isNew;
  }

  public InlineResponse20019Transactions importDate(String importDate) {
    this.importDate = importDate;
    return this;
  }

   /**
   * Date of transaction import, in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time).
   * @return importDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "Date of transaction import, in the format 'yyyy-MM-dd HH:mm:ss.SSS' (german time).")
  public String getImportDate() {
    return importDate;
  }

  public void setImportDate(String importDate) {
    this.importDate = importDate;
  }

  public InlineResponse20019Transactions children(List<Long> children) {
    this.children = children;
    return this;
  }

  public InlineResponse20019Transactions addChildrenItem(Long childrenItem) {
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Sub-transactions identifiers (if this transaction is split)
   * @return children
  **/
  @ApiModelProperty(example = "null", value = "Sub-transactions identifiers (if this transaction is split)")
  public List<Long> getChildren() {
    return children;
  }

  public void setChildren(List<Long> children) {
    this.children = children;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20019Transactions inlineResponse20019Transactions = (InlineResponse20019Transactions) o;
    return Objects.equals(this.id, inlineResponse20019Transactions.id) &&
        Objects.equals(this.parentId, inlineResponse20019Transactions.parentId) &&
        Objects.equals(this.accountId, inlineResponse20019Transactions.accountId) &&
        Objects.equals(this.valueDate, inlineResponse20019Transactions.valueDate) &&
        Objects.equals(this.bankBookingDate, inlineResponse20019Transactions.bankBookingDate) &&
        Objects.equals(this.finapiBookingDate, inlineResponse20019Transactions.finapiBookingDate) &&
        Objects.equals(this.amount, inlineResponse20019Transactions.amount) &&
        Objects.equals(this.purpose, inlineResponse20019Transactions.purpose) &&
        Objects.equals(this.counterpartName, inlineResponse20019Transactions.counterpartName) &&
        Objects.equals(this.counterpartAccountNumber, inlineResponse20019Transactions.counterpartAccountNumber) &&
        Objects.equals(this.counterpartIban, inlineResponse20019Transactions.counterpartIban) &&
        Objects.equals(this.counterpartBlz, inlineResponse20019Transactions.counterpartBlz) &&
        Objects.equals(this.counterpartBic, inlineResponse20019Transactions.counterpartBic) &&
        Objects.equals(this.counterpartBankName, inlineResponse20019Transactions.counterpartBankName) &&
        Objects.equals(this.counterpartMandateReference, inlineResponse20019Transactions.counterpartMandateReference) &&
        Objects.equals(this.counterpartCustomerReference, inlineResponse20019Transactions.counterpartCustomerReference) &&
        Objects.equals(this.counterpartCreditorId, inlineResponse20019Transactions.counterpartCreditorId) &&
        Objects.equals(this.type, inlineResponse20019Transactions.type) &&
        Objects.equals(this.typeCodeZka, inlineResponse20019Transactions.typeCodeZka) &&
        Objects.equals(this.typeCodeSwift, inlineResponse20019Transactions.typeCodeSwift) &&
        Objects.equals(this.primanota, inlineResponse20019Transactions.primanota) &&
        Objects.equals(this.category, inlineResponse20019Transactions.category) &&
        Objects.equals(this.labels, inlineResponse20019Transactions.labels) &&
        Objects.equals(this.isPotentialDuplicate, inlineResponse20019Transactions.isPotentialDuplicate) &&
        Objects.equals(this.isNew, inlineResponse20019Transactions.isNew) &&
        Objects.equals(this.importDate, inlineResponse20019Transactions.importDate) &&
        Objects.equals(this.children, inlineResponse20019Transactions.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, accountId, valueDate, bankBookingDate, finapiBookingDate, amount, purpose, counterpartName, counterpartAccountNumber, counterpartIban, counterpartBlz, counterpartBic, counterpartBankName, counterpartMandateReference, counterpartCustomerReference, counterpartCreditorId, type, typeCodeZka, typeCodeSwift, primanota, category, labels, isPotentialDuplicate, isNew, importDate, children);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20019Transactions {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    bankBookingDate: ").append(toIndentedString(bankBookingDate)).append("\n");
    sb.append("    finapiBookingDate: ").append(toIndentedString(finapiBookingDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    counterpartName: ").append(toIndentedString(counterpartName)).append("\n");
    sb.append("    counterpartAccountNumber: ").append(toIndentedString(counterpartAccountNumber)).append("\n");
    sb.append("    counterpartIban: ").append(toIndentedString(counterpartIban)).append("\n");
    sb.append("    counterpartBlz: ").append(toIndentedString(counterpartBlz)).append("\n");
    sb.append("    counterpartBic: ").append(toIndentedString(counterpartBic)).append("\n");
    sb.append("    counterpartBankName: ").append(toIndentedString(counterpartBankName)).append("\n");
    sb.append("    counterpartMandateReference: ").append(toIndentedString(counterpartMandateReference)).append("\n");
    sb.append("    counterpartCustomerReference: ").append(toIndentedString(counterpartCustomerReference)).append("\n");
    sb.append("    counterpartCreditorId: ").append(toIndentedString(counterpartCreditorId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeCodeZka: ").append(toIndentedString(typeCodeZka)).append("\n");
    sb.append("    typeCodeSwift: ").append(toIndentedString(typeCodeSwift)).append("\n");
    sb.append("    primanota: ").append(toIndentedString(primanota)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    isPotentialDuplicate: ").append(toIndentedString(isPotentialDuplicate)).append("\n");
    sb.append("    isNew: ").append(toIndentedString(isNew)).append("\n");
    sb.append("    importDate: ").append(toIndentedString(importDate)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

