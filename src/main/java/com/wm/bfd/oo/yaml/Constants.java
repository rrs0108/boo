package com.wm.bfd.oo.yaml;

public class Constants {

  /**
   * Global config
   */
  final public static String TEMPLATE = "/test.yaml";
  final public static String IP_OUTPUT = "json";
  final public static String DESCRIPTION = "GENERATED BY BOO. DO NOT MODIFY MANUALLY!";
  final public static String PLATFORMS = "platforms";
  final public static String EXTRACT = "extract";
  final public static String VARIABLES = "variables";
  final public static String DESCRIPTIONS = "description";
  final public static String YAML_ERROR = "The template file not found or has wrong format!";
  final public static String AVAILABILITY = "availability";
  final public static String GLOBAL_DNS = "global_dns";
  final public static String SUBDOMAIN = "subdomain";
  final public static String ENV_NAME = "environment_name";
  final public static String TRUE = "true";
  final public static String PRIVATE_IP = "private_ip";
  final public static String ACTIVE = "active";
  final public static String SIZE = "size"; 
  final public static String CINAME = "ciName";
  final public static String ASSEMBLY_PREFIX = "CUBEBOO-"; // Magic string.
  final public static String ASSEMBLY_NAME_TOO_LONG = "Assembly name cannot be more than 32 characters long. Please fix your assembly name in YAML.";
   /**
   * Customize config
   */
  final public static String IPTERMINATOR1 = "[";
  final public static String IPTERMINATOR2 = "]";
  final public static String NUMTERMINATOR1 = "{";
  final public static String NUMTERMINATOR2 = "}";
  final public static String DEDAULT_IPSPLIT = ",";
  final public static char DOLLAR = '$';
  final public static char SLASH = '/';
  final public static char DOT = '.';
  final public static char DASH = '-';
  final public static String ATTACHMENTS = "attachments";

  final public static String BFD_TOOL = "The tool is managed by BFD team.";
  final public static String NO_AVAILABILITY =
      "You don't set the availability, please check your yaml config.";

  // Components
  final public static String USER = "user";

  // Operate
  final public static String DEPLOYMENT_ID = "deploymentId";
  final public static String DEPLOYMENT_STATE = "deploymentState";

  // Output during deployment
  final public static String DESTROY_ASSEMBLY = "Destroyed assembly %s!";
  final public static String PLATFORM_EXISTING = "Platform exist, skip create platform %s.";
  final public static String CREATING_ASSEMBLY = "Auto generate assembly name turned on. Creating assembly %s ...";
  final public static String CREATING_PLATFORM = "Creating platform %s ...";
  final public static String DESTROY_PLATFORM = "Destroying platform %s ...";
  final public static String CONFIG_FILE = "Configuration file: %s";
  final public static String CONFIG_DIR = "Configuration dir: %s";
  final public static String WORKING_FILE = "Working file: %s";

  final public static String CREATE_COMPONENTS = "Creating component %s for %s ...";
  final public static String UPDATE_COMPONENTS = "Updating component %s for %s ...";

  final public static String CREATING_PLATFORM_SUCCEED = "Created platform %s.";
  final public static String START_DEPLOYMENT = "Starting the deployment now.";
  final public static String DEPLOYMENT_RUNNING = "Deployment is running ...";
  final public static String DEPLOYMENT_FAILED = "Deploy failed! %s";
  final public static String NO_NEED_DEPLOY = "NO deployment needed!";
  final public static String ACTIVE_DEPLOYMENT_EXISTING =
      "An active deployment has been running in the same environment, quit!";
  final public static String FAIL_DEPLOYMENT_EXISTING =
      "A failed deployment has been running in the same environment, quit!";
  final public static String CREATE_ENV = "Creating the environment %s.";
  final public static String ENV_EXISTING = "Environment exist, skip create environment %s.";
  final public static String COMPUTE_SIZE = "Updating the compute size in %s - %s";
  final public static String NEED_ANOTHER_CLEANUP =
      "A deployment has been started to remove active nodes. Please execute this command again once the deployment is complete to finish deleting remaining elements.";
  final public static String UPDATE_ERROR = "Cannot find assembly %s to update!";
  final public static String NO_DEPLOYMENT = "404 Not Found";

  // Debug
  final public static String ENV_NOT_EXISTING = "The environment %s is not exist! %s";



}
