package Logics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProjectCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ace.zip";
		
		System.out.println(str.substring(0, str.length()-4));
		
		String source1="ace,ace_8.42,adminconsoleapp,adminconsoleapp_8.5.2,admin_console,admin_console1_8.40,admin_console_redirect,alarm_routing_service,app_disco_apache,app_disco_iis_server,app_disco_mysql,app_disco_oracle,app_disco_sqlserver,attr_publisher,ATT_Temp_Local_WinDisk_0.3,ATT_Temp_Local_WinDisk_0.4,audit,automated_deployment_engine,automated_deployment_engine_8.47,automated_deployment_engine_8.53,automated_deployment_engine_v2-zip-8.3.0-HF01,baseline_engine,cabi,cdm,cdm_5.05,cm_data_import,dap,das,dashboard_engine,data_engine,dirscan-3_14,discovery_agent,discovery_agent_8.5.2,discovery_server-8.25,discovery_server,discovery_server_8.5.2,distsrv,ems-9.0.3,ems,fault_correlation_engine,health_index,HRG_Temp_Local_WinDisk_0.3,hub-7_93,hub,hub772,hub_7.80-fuj,hub_780HF14,hub_780HF9,ids_services,install_AIX_5_64,install_HPUX_11_64,install_HPUX_11_ia64,install_LINUX_23,install_LINUX_23_64,install_LINUX_23_ppc64,install_SOLARIS_10_amd64,install_SOLARIS_10_i386,install_SOLARIS_8_sparcv9,java_jre-1_80,java_jre,jre_solaris,jre_zlinux,logmon-3_54,maas-super-package-agentless_1.0,maas_super_package_customized_1.0,maas_super_package_spr2_1.0,maas_super_package_spr2_custom_1.0,maas_super_package_spr2_custom_2.0,maintenance_mode-8.52-HF1,maintenance_mode,monitoring_services,mon_config_service,mon_config_service_8.5.2,mon_config_service_cdm,mon_config_service_templates,mon_config_service_templates_10.3.2,mps,mpse,nas,nas475,nas856,nas_api_service,net_connect,nexec-1_35,nisapi_wasp,nis_server,ntevl-3_84,policy_engine,ppm,pp_defaults,prediction_engine,processes-4_01,qos_processor,relationship_services,robot_aix-7_80,robot_aix,robot_deb,robot_exe,robot_hpux,robot_rpm,robot_sol,robot_update-7_93,robot_update,robot_update_Rorign_1.0,robot_update_RTags_1.0,rsp,rsp_1_1.0,sdgtw-1.0.1-20151111.183241-25,sdgtw-1.1.0,sdgtw-1.3.0,sdgtw-1.31T3,servicepack_metapackage_helper,service_host,sla_engine,telemetry,telemetry_1.1.1,TEMPLATE_Local_WinDisk_0.4,TEMPLATE_Local_WinDisk_0.5,test_1.0,topology_agent,topology_fault_correlation,trellis,udm_manager,ugs-8.2.2,ugs,uimhome,uimserver_home,uimserver_home_redirect,uimserver_servicepack_metapackage_8.51-sp1,uim_azure_dashboards_pack,uim_core_dashboards_pack,ump,ump_accountadmin,ump_adminconsole,ump_alarmconsole,ump_cabi,ump_changepassword,ump_cloudmonitor,ump_customdashboards,ump_dashboard,ump_dashboarddesigner,ump_dynamicviews,ump_hf1,ump_listdesigner,ump_listdesigner_8.5.2_B,ump_listviewer,ump_listviewer_8.5.2_B,ump_maintenancemode,ump_mobile,ump_mytickets,ump_nimsoftremoteadmin,ump_policyeditor,ump_qoschart,ump_relationshipviewer,ump_reports,ump_reportscheduler,ump_servicedesk,ump_servicepack_metapackage_8.51-sp1,ump_slareports,ump_slm,ump_umpjslib,ump_umpmedia,ump_unifiedreports,ump_usm,ump_usm_8.5.2_B,ump_usm_8.52_HF15,vs2008_redist_ia64,vs2008_redist_ia64_v1.00,vs2008_redist_x64,vs2008_redist_x64_v1.00,vs2008_redist_x86,vs2008_redist_x86_v1.00,vs2010_vcredist_x64,vs2010_vcredist_x86,";
	    String source2="-wasp-";
	    String subterm_1 = "wasp";
	    String subterm_2 = "engine";

	    System.out.println(isContain(source2,subterm_1));
	   
		
		
	}
	
	//\b Matches a word boundary where a word character is [a-zA-Z0-9_].
	 private static boolean isContain(String source, String subItem){
         String pattern = "\\b"+subItem+"\\b";
         //String pattern = "subItem";
         Pattern p=Pattern.compile(pattern);
         Matcher m=p.matcher(source);
         return m.find();
    }

}
