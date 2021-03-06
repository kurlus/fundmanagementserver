package app;

//import app.def.EmployeeFundOpeningDef;
import app.def.FundDef;
import app.def.GLDef;
import app.def.CityDef;
import app.def.BankDef;
import app.def.BranchDef;
import app.def.CountryDef;
import app.def.GlFamilyDef;
import app.def.GlFormTypeDef;
import app.def.GlSlCodeDef;
import app.def.GlSlTypeDef;
import app.def.LoanInterestRateDef;
import app.def.LoanTypeDef;
import app.def.GlBookTypeDef;
import app.def.GlCurrencyDef;
import app.def.BankBranchDef;
import app.def.CostCentreDef;
import app.def.GlSlMappingDef;
import app.def.PayRollDef;
import app.def.PayRollLoanDef;
import app.def.PayRollPFContributionDef;
import app.def.PayRollPNContributionDef;
import app.def.RoleTypeDef;
import app.def.EmployeeTypeDef;
import app.def.TemplateDef;
import app.admin.UserRoleAdmin;
import app.beans.LoginEmployee;
import app.def.FinancialYearsDef;
import app.def.FinancialPeriodDef;
import app.transacs.GLBankReceiptTransacs;
import app.transacs.GLCashPaymentTransacs;
import app.transacs.GLBankPaymentTransacs;
import app.transacs.GLCashReceiptTransacs;
import app.transacs.GlJournalTransacs;
import app.transacs.LoaderInfoTransacs;
import app.transacs.LoanSettlementTransacs;
import utilities.AppUtility;
import utilities.AppConstants;

import java.util.logging.Level;

public class DefinitionLoader 
{

	public DefinitionLoader() 
	{
	}
	
	public DefResultSet loadDefinitions(LoginEmployee loginEmployee) throws Exception
	{
		try
		{
			switch(loginEmployee.getReqIdentifier())
			{		
				case AppConstants.glJournal:
					AppUtility.logger.log(Level.INFO, "load definition Request for GL Voucher");
					GlJournalTransacs glJournalTransacs = (GlJournalTransacs) AppUtility.getWebApplicationContext().getBean(AppConstants.glVoucherTransacsFactory); 
					defResultSet = glJournalTransacs.loadDefinitionData(loginEmployee);
					break;
				
				case AppConstants.glBankPayment:
					AppUtility.logger.log(Level.INFO, "load definition Request for GL Bank Payment");
					GLBankPaymentTransacs glBankPaymentDetTransacs = (GLBankPaymentTransacs) AppUtility.getWebApplicationContext().getBean(AppConstants.glBankPaymentTransacsFactory); 
					defResultSet = glBankPaymentDetTransacs.loadDefinitionData(loginEmployee);
					break;
			
				case AppConstants.glBankReceipt:
					AppUtility.logger.log(Level.INFO, "load definition Request for GL Bank Receipt");
					GLBankReceiptTransacs glBankPaymentMFTransacs = (GLBankReceiptTransacs) AppUtility.getWebApplicationContext().getBean(AppConstants.glBankReceiptTransacsFactory); 
					defResultSet = glBankPaymentMFTransacs.loadDefinitionData(loginEmployee);
					break;
			
				case AppConstants.glCashPayment:
					AppUtility.logger.log(Level.INFO, "load definition Request for GL Cash Payment");
					GLCashPaymentTransacs glBankReceiptDetTransacs = (GLCashPaymentTransacs) AppUtility.getWebApplicationContext().getBean(AppConstants.glCashPaymentDetTransacsFactory); 
					defResultSet = glBankReceiptDetTransacs.loadDefinitionData(loginEmployee);
					break;
			
				case AppConstants.glCashReceipt:
					AppUtility.logger.log(Level.INFO, "load definition Request for GL Cash Receipt");
					GLCashReceiptTransacs glBankReceiptMFTransacs = (GLCashReceiptTransacs) AppUtility.getWebApplicationContext().getBean(AppConstants.glCashReceiptTransacsFactory); 
					defResultSet = glBankReceiptMFTransacs.loadDefinitionData(loginEmployee);
					break;
			
				case AppConstants.bank:
					AppUtility.logger.log(Level.INFO, "load definition Request for Bank");
					BankDef bankDef = (BankDef) AppUtility.getWebApplicationContext().getBean(AppConstants.bankDefFactory); 
					defResultSet = bankDef.loadDefinitionData(loginEmployee);
					break;
					
				case AppConstants.template:
					AppUtility.logger.log(Level.INFO, "load definition Request for Template");
					TemplateDef templateDef = (TemplateDef) AppUtility.getWebApplicationContext().getBean(AppConstants.templateDefFactory); 
					defResultSet = templateDef.loadDefinitionData(loginEmployee);
					break;
					
				case AppConstants.employeeType:
					AppUtility.logger.log(Level.INFO, "load definition Request for Employee Type");
					EmployeeTypeDef employeeTypeDef = (EmployeeTypeDef) AppUtility.getWebApplicationContext().getBean(AppConstants.employeeTypeDefFactory); 
					defResultSet = employeeTypeDef.loadDefinitionData(loginEmployee);
					break;
				
				/*case AppConstants.employeeFundOpening:
					AppUtility.logger.log(Level.INFO, "load definition Request for Employee Type");
					EmployeeFundOpeningDef employeeFundOpeningDef = (EmployeeFundOpeningDef) AppUtility.getWebApplicationContext().getBean(AppConstants.employeeFundOpeningDefFactory); 
					defResultSet = employeeFundOpeningDef.loadDefinitionData(loginEmployee);
					break;*/
					
				case AppConstants.branch:
					AppUtility.logger.log(Level.INFO, "load definition Request for Branch");
					BranchDef branchDef = (BranchDef) AppUtility.getWebApplicationContext().getBean(AppConstants.branchDefFactory);
					defResultSet = branchDef.loadDefinitionData(loginEmployee);
					break;
					
				case AppConstants.bankBranch:
					AppUtility.logger.log(Level.INFO, "load definition Request for Bank Branch");
					BankBranchDef bankBranchDef = (BankBranchDef) AppUtility.getWebApplicationContext().getBean(AppConstants.bankBranchDefFactory); 
					defResultSet = bankBranchDef.loadDefinitionData(loginEmployee);
					break;
					
				case AppConstants.city:
					AppUtility.logger.log(Level.INFO, "load definition Request for City");
					CityDef cityDef = (CityDef) AppUtility.getWebApplicationContext().getBean(AppConstants.cityDefFactory); 
					defResultSet = cityDef.loadDefinitionData(loginEmployee);
					break;
					
				case AppConstants.country:
					AppUtility.logger.log(Level.INFO, "load definition Request for Country");
					CountryDef countryDef = (CountryDef) AppUtility.getWebApplicationContext().getBean(AppConstants.countryDefFactory); 
					defResultSet = countryDef.loadDefinitionData(loginEmployee);
					break;
					
				case AppConstants.costCentre:
					AppUtility.logger.log(Level.INFO, "load definition Request for Cost Centre");
					CostCentreDef costCentreDef = (CostCentreDef) AppUtility.getWebApplicationContext().getBean(AppConstants.costCentreDefFactory); 
					defResultSet = costCentreDef.loadDefinitionData(loginEmployee);
					break;
					
				case AppConstants.glCurrency:
					AppUtility.logger.log(Level.INFO, "load definition Request for Currency");
					glCurrencyDef = (GlCurrencyDef) AppUtility.getWebApplicationContext().getBean(AppConstants.glCurrencyDefFactory); 
					defResultSet = glCurrencyDef.loadDefinitionData(loginEmployee);
					break;
				
				case AppConstants.financialPeriod:
					AppUtility.logger.log(Level.INFO, "load definition Request for Financial Period");
					financialPeriodDefinition = (FinancialPeriodDef) AppUtility.getWebApplicationContext().getBean(AppConstants.financialPeriodDefFactory); 
					defResultSet = financialPeriodDefinition.loadDefinitionData(loginEmployee);
					break;
					
				case AppConstants.financialYears:
					AppUtility.logger.log(Level.SEVERE, "load definition Request for Employee");
					FinancialYearsDef yearsDef = (FinancialYearsDef) AppUtility.getWebApplicationContext().getBean(AppConstants.financialYearDefFactory); 
					defResultSet = yearsDef.loadDefinitionData(loginEmployee);
					break;
					
				case  AppConstants.gl:
					AppUtility.logger.log(Level.INFO, "load definition Request for Gl ");
					GLDef glDefinition = (GLDef) AppUtility.getWebApplicationContext().getBean(AppConstants.glDefFactory);
					defResultSet = glDefinition.loadDefinitionData(loginEmployee);
					break;	
					
				case  AppConstants.glFamilyType:
					AppUtility.logger.log(Level.INFO, "load definition Request for Gl family type");
					glFamilyTypeDefinition = (GlFamilyDef) AppUtility.getWebApplicationContext().getBean(AppConstants.glFamilyDefFactory);
					defResultSet = glFamilyTypeDefinition.loadDefinitionData(loginEmployee);
					break;	
					
				case  AppConstants.loaderInfo:
					AppUtility.logger.log(Level.INFO, "load definition Request for Loader Info");
					loaderInfoDefinition = (LoaderInfoTransacs) AppUtility.getWebApplicationContext().getBean(AppConstants.loaderInfoDefFactory);
					defResultSet = loaderInfoDefinition.loadDefinitionData(loginEmployee);
					break;	
				
				case AppConstants.loanType:
					AppUtility.logger.log(Level.INFO, "load definition Request for Loan Type");
					LoanTypeDef loanTypeDef = (LoanTypeDef) AppUtility.getWebApplicationContext().getBean(AppConstants.loanTypeFactory);
					defResultSet = loanTypeDef.loadDefinitionData(loginEmployee);
					break;
				
			case AppConstants.roleType:
				AppUtility.logger.log(Level.INFO, "load definition Request for Role Type");
				RoleTypeDef roleTypeDef = (RoleTypeDef) AppUtility.getWebApplicationContext().getBean(AppConstants.roleTypeFactory);
				defResultSet = roleTypeDef.loadDefinitionData(loginEmployee);
				break;

			case AppConstants.userRole:
				AppUtility.logger.log(Level.INFO, "load definition Request for User Role");
				UserRoleAdmin userDef = (UserRoleAdmin) AppUtility.getWebApplicationContext().getBean(AppConstants.userRoleFactory);
				defResultSet = userDef.loadDefinitionData(loginEmployee);
				break;

			case AppConstants.glBookType:
				AppUtility.logger.log(Level.INFO, "load definition Request for Gl book type");
				glBookTypeDefinition = (GlBookTypeDef) AppUtility.getWebApplicationContext().getBean(AppConstants.glBookTypeDefFactory);
				defResultSet = glBookTypeDefinition.loadDefinitionData(loginEmployee);
				break;

			case AppConstants.glSlType:
				AppUtility.logger.log(Level.INFO, "load definition Request for Gl SL Type");
				glSlTypeDefinition = (GlSlTypeDef) AppUtility.getWebApplicationContext().getBean(AppConstants.glSlTypeDefFactory);
				defResultSet = glSlTypeDefinition.loadDefinitionData(loginEmployee);
				break;

			case AppConstants.glSlMapping:
				AppUtility.logger.log(Level.INFO, "load definition Request for Gl Sl mapping");
				glSlMappingDefinition = (GlSlMappingDef) AppUtility.getWebApplicationContext().getBean(AppConstants.glSlMappingDefFactory);
				defResultSet = glSlMappingDefinition.loadDefinitionData(loginEmployee);
				break;
			
			case AppConstants.glSlCode:
				AppUtility.logger.log(Level.INFO, "load definition Request for GLSLCodes");
				GlSlCodeDef glSlCodeDef = (GlSlCodeDef) AppUtility.getWebApplicationContext().getBean(AppConstants.glSlCodeDefFactory);
				defResultSet = glSlCodeDef.loadDefinitionData(loginEmployee);
				break;
			case AppConstants.loanInterestRate:
				AppUtility.logger.log(Level.INFO, "load definition Request for Loan Approval");
				LoanInterestRateDef loanInterestRateExecutor = (LoanInterestRateDef) AppUtility.getWebApplicationContext().getBean(AppConstants.loanInterestRateDefFactory);
				defResultSet = loanInterestRateExecutor.loadDefinitionData(loginEmployee);
				break;
			case AppConstants.payRollLoan:
				AppUtility.logger.log(Level.INFO, "load definition Request for PayRoll Loan");
				PayRollLoanDef payRollLoanDefExecutor = (PayRollLoanDef) AppUtility.getWebApplicationContext().getBean(AppConstants.payRollLoanDefFactory);
				defResultSet = payRollLoanDefExecutor.loadDefinitionData(loginEmployee);
				break;	
			case AppConstants.payRollPFContribution:
				AppUtility.logger.log(Level.INFO, "load definition Request for PayRoll PF Contribution");
				PayRollPFContributionDef payRollPFContributionDefExecutor = (PayRollPFContributionDef) AppUtility.getWebApplicationContext().getBean(AppConstants.payRollPFContributionDefFactory);
				defResultSet = payRollPFContributionDefExecutor.loadDefinitionData(loginEmployee);
				break;	
			case AppConstants.payRollPNContribution:
				AppUtility.logger.log(Level.INFO, "load definition Request for PayRoll PNContribution");
				PayRollPNContributionDef payRollPNContributionDefExecutor = (PayRollPNContributionDef) AppUtility.getWebApplicationContext().getBean(AppConstants.payRollPNContributionDefFactory);
				defResultSet = payRollPNContributionDefExecutor.loadDefinitionData(loginEmployee);
				break;	
			case AppConstants.payRoll:
				AppUtility.logger.log(Level.INFO, "load definition Request for PayRoll");
				PayRollDef payRollDefExecutor = (PayRollDef) AppUtility.getWebApplicationContext().getBean(AppConstants.payRollDefFactory);
				defResultSet = payRollDefExecutor.loadDefinitionData(loginEmployee);
				break;
			case AppConstants.loanSettlement:
				AppUtility.logger.log(Level.INFO, "load definition Request for LoanSettlement");
				LoanSettlementTransacs loanSettlementTransacs = (LoanSettlementTransacs) AppUtility.getWebApplicationContext().getBean(AppConstants.loanSettlementDefFactory);
				defResultSet = loanSettlementTransacs.loadDefinitionData(loginEmployee);
				break;
				
			case AppConstants.fund:
				AppUtility.logger.log(Level.INFO, "load definition Request for Fund");
				FundDef fund = (FundDef) AppUtility.getWebApplicationContext().getBean(AppConstants.fundDefFactory);
				defResultSet = fund.loadDefinitionData(loginEmployee);
				break;
				
			case AppConstants.glFormType:
				AppUtility.logger.log(Level.INFO, "load definition Request for Gl Form type");
				GlFormTypeDef glFormTypeDefinition = (GlFormTypeDef) AppUtility.getWebApplicationContext().getBean(AppConstants.glFormTypeDefFactory);
				defResultSet = glFormTypeDefinition.loadDefinitionData(loginEmployee);
				break;
			default:
				AppUtility.logger.log(Level.SEVERE, "No definition is defined");
			}
		}
		catch(Exception ex)
		{
			AppUtility.logger.log(Level.SEVERE, "Load definition for  "+loginEmployee.getReqIdentifier()+" has error reason="+ex.getMessage());
			throw ex;
		}
		return defResultSet;
	}
	
	public synchronized DefResultSet getDefResultSet() 
	{
		return defResultSet;
	}

	public synchronized void setDefResultSet(DefResultSet defResultSet) 
	{
		this.defResultSet = defResultSet;
	}
	
	private DefResultSet defResultSet;
	private GlCurrencyDef glCurrencyDef;
	private GlSlTypeDef glSlTypeDefinition;
	private GlFamilyDef glFamilyTypeDefinition;
	private GlBookTypeDef glBookTypeDefinition;
	private GlSlMappingDef glSlMappingDefinition;
	private LoaderInfoTransacs loaderInfoDefinition;
	private FinancialPeriodDef financialPeriodDefinition;
	
		
}
