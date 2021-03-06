package utilities;

import java.io.Serializable;

public interface AppConstants extends Serializable
{

	String BLANK = "";
	String EQUAL="=";
	String AMPERSAD="&";
	String nullValue = null;
	
	int zero = 0;
	int minusOne = -1;
	String defaultTerminalID = "127.0.0.1";
	
	int one = 1; int two = 2; int three = 3; int four = 4; int five = 5;
	int six = 6; int seven = 7; int eight = 8; int nine = 9; int ten = 10;
	int eleven = 11; int twelve = 12; int thirteen = 13; int fourteen = 14;
	int fifteen = 15; int sixteen = 16; int seventeen = 17; int eighteen = 18;
	int ninteen = 19; int twenty = 20; int twentyone = 21; int twentytwo = 22;
	int twentythree = 23; int twentyfour = 24; int twentyfive = 25; int twentysix = 26;
	int twentyseven = 27; int twentyeight = 28; int twentynine = 29; int thirty = 30;
	int thirtyone = 31; int thirtytwo = 32; int thirtythree = 33; int thirtyfour = 34;
	int thirtyfive = 35; int thirtysix = 36; int thirtyseven = 37; int thirtyeight = 38;
	int thirtynine = 39; int forty = 40; int fortyone = 41; int fortytwo = 42;
	int fortythree = 43; int fortyfour = 44; int fortyfive = 45; int fortysix = 46;
	int maxExceptionString = 7950;

	int threadPoolSize = 10;
	String post = "post";
	String logID = "log_id";
	
	String logFileName = "ServerLog"+".log";
	String projectPropertiesBean = "ProjectPrps";
	String appFileHandlerBean = "appFileHandler";
	String compositeLoaderBean = "compositeLoader";
	String sessionIDGenerator = "sessionIDGenerator";

	String dataSource = "dataSource";
	String dateFormat4Web = "MM/dd/yyyy";
	String dateFormat4Socket = "MM-dd-yyyy";	
	String loggerName = "Fund-Management-System";
	String dateTimeFormat = "MM/dd/yy::HH:mm:ss:SS";
	String dateTimeFormatStr = "yyyy/MM/dd HH:mm:ss.SSS";
	
	//Employee
	String employeeParamNIC = "nic";
	String employeeParamDOJ = "doj";
	String employeeParamDOC = "doc";
	String employeeParamDOB = "dob";
	String employeeParamGender = "gender";
	String employeeParamActive = "active";
	String employeeParamUserID = "user_id";
	String employeeParamLName = "last_name";
	String employeeParamFName = "first_name";
	String employeeParamEmployeeID = "employee_id";
	String employeeParamOBO = "obo";
	
	/*GL_GLMF*/
	String glMFCode = "gl_mf_code";
	String glMFlevel = "gl_mf_level";
	String glMFFamilyID = "gl_family_id";
	String glMFlevelDesc = "gl_gen_detail";
	String glMFDescription = "gl_mf_description";
	
	/* get spring definition factory objects */	
	String glDefFactory = "GLDef";
	String bankDefFactory = "bankDef";
	String fundDefFactory = "fundDef";
	String templateDefFactory = "templateDef"; 
	String cityDefFactory = "cityDef";
	String branchDefFactory = "branchDef";
	String userRoleFactory = "userRoleDef";
	String loanTypeFactory = "loanTypeDef";
	String roleTypeFactory = "roleTypeDef";
	String workFlowFactory = "workFlowDef";
	String payRollDefFactory = "payRollDef";
	String countryDefFactory = "countryDef";
	String glSlTypeDefFactory = "glSlTypeDef";
	String glSlCodeDefFactory = "glSlCodeDef";
	String employeeDefFactory = "employeeDef";
	String glFamilyDefFactory = "glFamilyDef";
	String loaderRunDefFactory = "loaderRunDef";
	String loanPaymentfactory = "loanPaymentDef";
	String loanProcessFactory = "loanProcessDef";
	String glCurrencyDefFactory = "glCurrencyDef";
	String glBookTypeDefFactory = "glBookTypeDef";
	String glFormTypeDefFactory = "glFormTypeDef";
	String loaderInfoDefFactory = "loaderInfoDef";
	String bankBranchDefFactory = "bankBranchDef";
	String costCentreDefFactory = "costCentreDef";
	String loginEmpDefFactory = "loginEmployeeDef";
	String loanApprovalFactory = "loanApprovalDef";
	String loanSchedulefactory = "loanScheduleDef";
	String payRollLoanDefFactory = "payRollLoanDef";
	String glSlMappingDefFactory = "glSlMappingDef";
	String employeeTypeDefFactory = "employeeTypeDef"; 
	String loanSettlementDefFactory = "loanSettlementDef";
	String financialYearDefFactory = "financialYearsDef";
	String importEmployeeDefFactory = "importEmployeeDef";
	String workFlowEventsDefFactory = "workFlowEventsDef"; 
	String importLoanPayrollDefFactory = "importPayrollDef";
	String financialPeriodDefFactory = "financialPeriodDef";
	String importLoanApplyDefFactory = "importLoanApplyDef";
	String workFlowHistoryDefFactory = "workFlowHistoryDef";
	String loanInterestRateDefFactory = "loanInterestRateDef";
	String workFlowEventTypeDefFactory = "workFlowEventTypeDef";
	String employeeRoleMappingDefFactory = "employeRoleMappingDef";
	String importLoanPaymentsDefFactory = "importLoanPaymentDef";	
	String workFlowEventActionDefFactory = "workFlowEventActionDef";
	String employeeFundOpeningDefFactory = "employeeFundOpeningDef"; 
	String payRollPFContributionDefFactory = "payRollPFContributionDef";
	String payRollPNContributionDefFactory = "payRollPNContributionDef";
	String definitionLoader = "definitionLoader";
	String hibernateSessionFactory = "sessionFactory";

	String glVoucherTransacsFactory = "glJournalTransacs";
	String glBankPaymentTransacsFactory = "glBankPaymentTransacs";
	String glBankReceiptTransacsFactory = "glBankReceiptTransacs";
	String glCashReceiptTransacsFactory = "glCashReceiptTransacs";
	String glCashPaymentDetTransacsFactory = "glCashPaymentTransacs";
	
	
	/*** get spring definition factory objects for DML operations ********/
	
	String DMLGlmfFactory = "glmfDMLExecutor";
	String DMLBankFactory = "bankDMLExecutor";
	String DMLCityFactory = "cityDMLExecutor";
	String DMLBranchFactory = "branchDMLExecutor";
	String HDMLFactory = "hibernateDMLOperations";
	String DMLLoanDefFactory = "loanDefDMLExecutor";
	String DMLGlSlCodeDefFactory = "glSlCodeDefDML";
	String DMLLoanTypeFactory="loanTypeDMLExecutor";
	String DMLCountryFactory = "countryDMLExecutor";
	String DMLEmployeeFactory = "employeeDMLExecutor";
	String DMLUserRoleFactory = "userRoleDMLExecutor";
	String DMLTemplateFactory = "templateDMLExecutor";
	String DMLWorkFlowFactory = "workFlowDMLExecutor";
	String DMLWfMfAdminFactory = "workFlowMFAdminDML";
	String DMLGlSlTypeDefFactory = "glSlTypeDMLExecutor";
	String DMLLoanPaymentFactory="loanPaymentDMLExecutor";
	String DMLGlCurrencyFactory = "glCurrencyDMLExecutor";
	String DMLBankBranchFactory = "bankBranchDMLExecutor";
	String DMLCostCentreFactory = "costCentreDMLExecutor";
	String DMLGLBookTypeDefFactory = "glBookTypeDMLExecutor";
	String DMLGLFormTypeDefFactory = "glFormTypeDMLExecutor";
	String DMLLoanSettlementFactory="loanSettlementDMLExecutor";
	String DMLLoanApprovalFactory = "loanApprovalDMLExecutor";
	String DMLEmployeeTypeFactory = "employeeTypeDMLExecutor"; 
	String DMLEmployeeFundOpeningFactory = "employeeFundOpeningDMLExecutor"; 
	String DMLGlSlMappingDefFactory = "glSlMappingDMLExecutor";
	String DMLImpEmployeeFactory = "importEmployeeTransacsDML";
	String DMLGeneralRequestFactory = "generalRequestDMLExecutor";
	String DMLFinancialYearsFactory = "financialYearsDMLExecutor";
	String DMLWorkFlowEventsFactory = "workFlowEventsDMLExecutor";
	String DMLWorkFlowHistoryFactory = "workFlowHistoryDMLExecutor";
	String DMLFinancialPeriodFactory = "financialPeriodDMLExecutor";
	String DMLLoanInterestRateFactory = "loanInterestRateDMLExecutor";
	String DMLWfEventTypeFactory = "workFlowEventTypeAdminDMLExecutor";
	String DMLEmployeeRoleMappAdminFactory = "employeeRoleMappAdminDML";
	String DMLImportPayrollTransacsFactory = "importPayrollTransacsDML";
	String DMLLoanApplyBalLimitFactory = "loanApplyBalLimitDMLExecutor";
	String DMLGLJournalFactory = "glJournalTransacsDMLExecutor";
	String DMLGLBankPaymentFactory = "glBankPaymentTransacsDMLExecutor";
	String DMLGLBankReceiptFactory = "glBankReceiptTransacsDMLExecutor";
	String DMLGLCashPaymentFactory = "glCashPaymentTransacsDMLExecutor";
	String DMLGLCashReceiptFactory = "glCashReceiptTransacsDMLExecutor";
	String DMLWfTransitionFactory = "workFlowTransitionAdminDMLExecutor";
	String DMLWfEventActionFactory = "workFlowEventActionAdminDMLExecutor";
	String DMLVoucherTemplateMFFactory = "glVoucherTemplateMFDMLExecutor";
	String DMLImportLoanApplyTransacsFactory = "importLoanApplyTransacsDML";
	String DMLVoucherTemplateTypeFactory = "glVoucherTemplateTypeDMLExecutor";
	String DMLImportLoanPaymentTransacsFactory = "importLoanPaymentTransacsDML";
	
	/* Role detail */
	String roleTypeID = "role_type_id";
	String roleDetailRoleID = "role_id";
	String roleDetailOprID = "operation_id";
	
	/* App Menus */
	String appMenuMenuID = "menu_id";
	String modFilterByMenu = "ByMenu";
	String appMenuGroupID  = "group_id";
	String appMenuMenuURL	= "menu_url";
	String appMenuModuleID = "module_id";
	String modFilterByModule = "ByModule";	
	String appMenuMenuLabel	= "menu_label";
	String appMenuMenuDesc = "menu_description";
	String modFilteration = "module_filteration";
	String appMenuParentMenuID = "parent_menu_id";
	
	/* App Module */
	String appModuleModID = "module_id";
	String appModuleModDesc = "module_description";
	
	/* App Menu Group */
	String appMenuGroup = "group_id";
	String appMenuGroupShortName = "short_name";
	String appMenuGroupDesc = "group_description";
	
	/*** DML Operation Types ****/
	String oprDel = "DEL";
	String oprAdd = "ADD";
	String oprRun = "RUN";
	String oprView = "VIEW";
	String oprSave = "SAVE";
	String oprPost = "POST";
	String oprEdit = "EDIT";
	String oprGLoan  = "GLOAN";
	String filterByALL = "ALL";
	String filterBySelected = "SELECTED";
	String filterForOtherScreenUsage = "OTHERS";
	
	String roleTypeHR = "HR";
	String roleTypeAdmin = "ADMIN";
	String roleTypeMember = "MEMBER";
	String roleTypeTrustee = "TRUSTEE";
	String roleTypeTreasury = "TREASURY";
	
	
	/* definition identifiers */
	String gl = "GL";
	String wfMF = "WFMF";
	String bank = "BANK";
	String fund = "FUND";
	String city = "CITY";
	String branch = "BRANCH";
	String country = "COUNTRY";
	String payRoll = "PAY_ROLL";
	String loanDef = "LOAN_DEF";
	String template = "TEMPLATE"; 
	String employee = "EMPLOYEE";
	String loanType = "LOAN_TYPE";
	String userRole = "USER_ROLE";
	String roleType = "ROLE_TYPE";
	String workFlow = "WORK_FLOW";
	String glSlCode = "GL_SL_CODE";
	String glSlType = "GL_SL_TYPE";
	String glVoucher = "GL_VOUCHER";
	String loaderRun = "LOADER_RUN";
	String loanApply = "LOAN_APPLY";
	String loaderInfo = "LOADER_INFO";
	String costCentre = "COST_CENTRE";
	String bankBranch = "BANK_BRANCH";
	String glCurrency = "GL_CURRENCY";
	String glBookType = "GL_BOOK_TYPE";
	String glFormType = "GL_FORM_TYPE";
	String loanPayment = "Loan_Payment";
	String loanProcess = "Loan_Process";
	String wfEventType = "WF_EVENT_TYPE";
	String payRollLoan = "PAY_ROLL_LOAN";
	String loanApproval = "LOAN_APPROVAL";
	String employeeType = "EMPLOYEE_TYPE";
	String employeeFundOpening = "EMPLOYEE_FUND_OPENING";
	String chartOfAccount = "CHART_OF_ACC";
	String glFamilyType = "GL_FAMILY_TYPE";
	String wfEventAction = "WF_EVENT_ACTION";
	String loginEmployee = "LOGIN_EMPLOYEE";
	String workFlowEvents = "WORKFLOWEVENTS";
	String glBankPayment = "GL_BANK_PAYMENT";
	String glBankReceipt = "GL_BANK_RECEIPT";
	String glCashPayment = "GL_CASH_PAYMENT";
	String glCashReceipt = "GL_CASH_RECEIPT";
	String financialYears = "FINANCIAL_YEARS";
	String loanSettlement = "LOAN_SETTLEMENT";
	String generalRequest = "GENERAL_REQUEST";
	String wfEventTransition = "WF_TRANSITION";
	String workFlowHistory = "WORKFLOWHISTORY";
	String financialPeriod = "FINANCIAL_PERIOD";
	String loanInterestRate = "LOAN_INTEREST_RATE";
	
	
	String workFlowEventType = "WORKFLOWEVENTTYPE";
	String glJournal= "GL_JOURNAL";
	String employeeRolesMapping = "EMP_ROLE_MAPPING";
	String loanApplyInterest = "LOAN_APPLY_INTEREST";
	String loanApplyBalLimit = "LOAN_APPLY_BAL_LIMIT";
	String bookTypeSequence = "BOOK_TYPE_SEQUENCE";
	String validateDate ="VALIDATE_DATE";
	String workFlowEventAction = "WORKFLOWEVENTACTION";
	String loanPayemtSchedule = "Loan_Payment_Schedule";
	String glVocuherTemplateMf = "GL_VOUCHER_TEMPLATE_MF";
	String glVoucherTemplateType = "GL_VOUCHER_TEMPLATE_TYPE";
	String payRollPFContribution = "PAY_ROLL_PF_CONTRIBUTION";
	String payRollPNContribution = "PAY_ROLL_PN_CONTRIBUTION";
	String employeeRolesMappingMenus = "EMP_ROLE_MAPPING_MENUS";
	
	
	String glSlMapping = "GL_SL_MAPPING";
	String importPayroll = "IMPORT_PAYROLL";
	String importEmployee = "IMPORT_EMPLOYEE";
	String importLoanApply = "IMPORT_LOAN_APPLY";
	String importLoanPayments = "IMPORT_LOAN_PAYMENTS";
	
	/************* import tables parameters ***************/
	String loaderRunID = "loader_id";
	String parameterBatchID = "batch_id";
	String importPayRollBatchIDParam = "batchID";
	
	/************* Procedures *******************/

	String funcPeriodID="GET_PERIOD_ID";
	String funcVaidateDate="VALIDATE_DATE";
	String funcFinancialID="GET_FINANCIAL_ID";
	String funcFormNumber="GET_FORM_NO";
	
	String prcEmployeeValidation = "SP_VALIDATION_EMPLOYEE";
	String prcEmployeeValidationAll = "SP_VALIDATION_EMPLOYEE_ALL";
	String prcGenerateLoan = "SP_GENERATE_LOANS";
	
	String prcLoanApplyBalLimit="SP_GET_LOAN_BALANCE";
	String prcLoanApplyInterestAmount="SP_GET_INTEREST_AMOUNT";
	String prcImportPayrollValidation = "SP_VALIDATION_PAYROLL";
	String prcImportPayrollValidationAll = "SP_VALIDATION_PAYROLL_ALL";
	String prcImportLoanApplyValidation = "SP_VALIDATION_LOANAPPLY";
	String prcImportLoanApplyValidationAll = "SP_VALIDATION_LOANAPPLY_ALL";
	String prcImportLoanPaymentValidation = "SP_VALIDATION_LOANPAYMENT";
	String prcImportLoanPaymentValidationAll = "SP_VALIDATION_LOANPAYMENT_ALL";
	
	/************* Procedures Parameters*******************/
	String paramLoanDate="pApply_date";
	String paramLoanAmount="pApply_amount";
	String paramInterestAmount="pInterest_amount";
	String paramEmployeeID = "pEmployee_id";
	String paramLoanTypeID = "pLoan_type_id";
	String paramBalance = "pLoan_Balance";
	String paramApplyLimit = "pLoan_Limit";
	String paramEmployeeValidationBatchID = "pBatch_Id";
	String paramEmployeeValidationRecordID = "pRecord_Id";
	String paramGernerateLoanProc = "pApply_Id";
	
	String paramDate="pDate";
	String paramPeriodType="pType";
	String paramFundShort="pFundShort";
	String paramBookType="pBookType";
	String paramPeriodID="pPeriodId";
	String paramFinancialID="pFinancialId";
	
	/*
	 * 
	 * =====================================================================================================================================================
	 * 													SOCKET SERVER CONSTANTS
	 * =====================================================================================================================================================
	 * 
	 */
	
	int clientSocketRetries = 10;
	String byteBufferSize = "byteBufferSize";
	String appServerLogger = "fund-managment";
	
	String socketServerIP = "socketServerIP";
	String socketServerPort = "socketServerPort";	
	String socketLogFileName = "socketLogFileName";
	String socketLogFileLocation = "socketLogFileLocation";
	
	String excelXLSFileFormat = "xls";
	String excelXLSXFileFormat = "xlsx";
	
	enum upLoadDataTypes {Remuneration, Profile, Loan, SAP, ALL};
	enum upLoadStates {PARTIAL, COMPLETED, FAILED};

}
