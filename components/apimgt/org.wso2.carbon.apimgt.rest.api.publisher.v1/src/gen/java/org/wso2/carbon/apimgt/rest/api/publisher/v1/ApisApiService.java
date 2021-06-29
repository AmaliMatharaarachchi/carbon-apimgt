package org.wso2.carbon.apimgt.rest.api.publisher.v1;

import org.wso2.carbon.apimgt.rest.api.publisher.v1.*;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.*;

import org.apache.cxf.jaxrs.ext.MessageContext;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.wso2.carbon.apimgt.api.APIManagementException;

import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.APIDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.APIExternalStoreListDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.APIKeyDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.APIListDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.APIMonetizationInfoDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.APIRevenueDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.APIRevisionDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.APIRevisionDeploymentDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.APIRevisionDeploymentListDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.APIRevisionListDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.ApiEndpointValidationResponseDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.AsyncAPISpecificationValidationResponseDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.AuditReportDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.CertificateInfoDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.ClientCertMetadataDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.ClientCertificatesDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.CommentDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.CommentListDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.DeployedAPIRevisionDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.DocumentDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.DocumentListDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.ErrorDTO;
import java.io.File;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.FileInfoDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.GraphQLQueryComplexityInfoDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.GraphQLSchemaDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.GraphQLSchemaTypeListDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.GraphQLValidationResponseDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.LifecycleHistoryDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.LifecycleStateDTO;
import java.util.List;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.MediationDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.MediationListDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.MockResponsePayloadListDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.OpenAPIDefinitionValidationResponseDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.PatchRequestBodyDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.PostRequestBodyDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.ResourcePathListDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.ResourcePolicyInfoDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.ResourcePolicyListDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.ThrottlingPolicyDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.TopicListDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.WSDLInfoDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.WSDLValidationResponseDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.WorkflowResponseDTO;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public interface ApisApiService {
      public Response addAPIClientCertificate(String apiId, InputStream certificateInputStream, Attachment certificateDetail, String alias, String tier, String organizationId, MessageContext messageContext) throws APIManagementException;
      public Response addAPIDocument(String apiId, DocumentDTO documentDTO, String organizationId, String ifMatch, MessageContext messageContext) throws APIManagementException;
      public Response addAPIDocumentContent(String apiId, String documentId, String organizationId, String ifMatch, InputStream fileInputStream, Attachment fileDetail, String inlineContent, MessageContext messageContext) throws APIManagementException;
      public Response addAPIMediationPolicy(String apiId, String type, String organizationId, String ifMatch, InputStream mediationPolicyFileInputStream, Attachment mediationPolicyFileDetail, String inlineContent, MessageContext messageContext) throws APIManagementException;
      public Response addAPIMonetization(String apiId, APIMonetizationInfoDTO apIMonetizationInfoDTO, String organizationId, MessageContext messageContext) throws APIManagementException;
      public Response addCommentToAPI(String apiId, PostRequestBodyDTO postRequestBodyDTO, String replyTo, MessageContext messageContext) throws APIManagementException;
      public Response apisApiIdAsyncapiGet(String apiId, String organizationId, String ifNoneMatch, MessageContext messageContext) throws APIManagementException;
      public Response apisApiIdAsyncapiPut(String apiId, String organizationId, String ifMatch, String apiDefinition, String url, InputStream fileInputStream, Attachment fileDetail, MessageContext messageContext) throws APIManagementException;
      public Response changeAPILifecycle(String action, String apiId, String organizationId, String lifecycleChecklist, String ifMatch, MessageContext messageContext) throws APIManagementException;
      public Response createAPI(APIDTO APIDTO, String organizationId, String openAPIVersion, MessageContext messageContext) throws APIManagementException;
      public Response createAPIRevision(String apiId, String organizationId, APIRevisionDTO apIRevisionDTO, MessageContext messageContext) throws APIManagementException;
      public Response createNewAPIVersion(String newVersion, String apiId, String organizationId, Boolean defaultVersion, String serviceVersion, MessageContext messageContext) throws APIManagementException;
      public Response deleteAPI(String apiId, String organizationId, String ifMatch, MessageContext messageContext) throws APIManagementException;
      public Response deleteAPIClientCertificateByAlias(String alias, String apiId, String organizationId, MessageContext messageContext) throws APIManagementException;
      public Response deleteAPIDocument(String apiId, String documentId, String organizationId, String ifMatch, MessageContext messageContext) throws APIManagementException;
      public Response deleteAPILifecycleStatePendingTasks(String apiId, String organizationId, MessageContext messageContext) throws APIManagementException;
      public Response deleteAPIMediationPolicyByPolicyId(String apiId, String mediationPolicyId, String organizationId, String ifMatch, MessageContext messageContext) throws APIManagementException;
      public Response deleteAPIRevision(String apiId, String revisionId, String organizationId, MessageContext messageContext) throws APIManagementException;
      public Response deleteComment(String commentId, String apiId, String ifMatch, MessageContext messageContext) throws APIManagementException;
      public Response deployAPIRevision(String apiId, String revisionId, String organizationId, List<APIRevisionDeploymentDTO> apIRevisionDeploymentDTO, MessageContext messageContext) throws APIManagementException;
      public Response deployedAPIRevision(List<DeployedAPIRevisionDTO> deployedAPIRevisionDTO, MessageContext messageContext) throws APIManagementException;
      public Response editCommentOfAPI(String commentId, String apiId, PatchRequestBodyDTO patchRequestBodyDTO, MessageContext messageContext) throws APIManagementException;
      public Response exportAPI(String apiId, String name, String version, String revisionNumber, String providerName, String format, Boolean preserveStatus, Boolean latestRevision, MessageContext messageContext) throws APIManagementException;
      public Response generateInternalAPIKey(String apiId, MessageContext messageContext) throws APIManagementException;
      public Response generateMockScripts(String apiId, String organizationId, String ifNoneMatch, MessageContext messageContext) throws APIManagementException;
      public Response getAPI(String apiId, String organizationId, String xWSO2Tenant, String ifNoneMatch, MessageContext messageContext) throws APIManagementException;
      public Response getAPIClientCertificateByAlias(String alias, String apiId, String organizationId, MessageContext messageContext) throws APIManagementException;
      public Response getAPIClientCertificateContentByAlias(String apiId, String alias, String organizationId, MessageContext messageContext) throws APIManagementException;
      public Response getAPIClientCertificates(String apiId, String organizationId, Integer limit, Integer offset, String alias, MessageContext messageContext) throws APIManagementException;
      public Response getAPIDocumentByDocumentId(String apiId, String documentId, String ifNoneMatch, String organizationId, MessageContext messageContext) throws APIManagementException;
      public Response getAPIDocumentContentByDocumentId(String apiId, String documentId, String ifNoneMatch, String organizationId, MessageContext messageContext) throws APIManagementException;
      public Response getAPIDocuments(String apiId, String organizationId, Integer limit, Integer offset, String ifNoneMatch, MessageContext messageContext) throws APIManagementException;
      public Response getAPIGraphQLSchema(String apiId, String organizationId, String accept, String ifNoneMatch, MessageContext messageContext) throws APIManagementException;
      public Response getAPILifecycleHistory(String apiId, String organizationId, String ifNoneMatch, MessageContext messageContext) throws APIManagementException;
      public Response getAPILifecycleState(String apiId, String organizationId, String ifNoneMatch, MessageContext messageContext) throws APIManagementException;
      public Response getAPIMediationPolicyByPolicyId(String apiId, String mediationPolicyId, String organizationId, String ifNoneMatch, MessageContext messageContext) throws APIManagementException;
      public Response getAPIMediationPolicyContentByPolicyId(String apiId, String mediationPolicyId, String organizationId, String ifNoneMatch, MessageContext messageContext) throws APIManagementException;
      public Response getAPIMonetization(String apiId, String organizationId, MessageContext messageContext) throws APIManagementException;
      public Response getAPIResourcePaths(String apiId, String organizationId, Integer limit, Integer offset, String ifNoneMatch, MessageContext messageContext) throws APIManagementException;
      public Response getAPIResourcePolicies(String apiId, String sequenceType, String organizationId, String resourcePath, String verb, String ifNoneMatch, MessageContext messageContext) throws APIManagementException;
      public Response getAPIResourcePoliciesByPolicyId(String apiId, String resourcePolicyId, String organizationId, String ifNoneMatch, MessageContext messageContext) throws APIManagementException;
      public Response getAPIRevenue(String apiId, String organizationId, MessageContext messageContext) throws APIManagementException;
      public Response getAPIRevision(String apiId, String revisionId, MessageContext messageContext) throws APIManagementException;
      public Response getAPIRevisionDeployments(String apiId, MessageContext messageContext) throws APIManagementException;
      public Response getAPIRevisions(String apiId, String query, MessageContext messageContext) throws APIManagementException;
      public Response getAPISubscriptionPolicies(String apiId, String organizationId, String xWSO2Tenant, String ifNoneMatch, MessageContext messageContext) throws APIManagementException;
      public Response getAPISwagger(String apiId, String organizationId, String ifNoneMatch, MessageContext messageContext) throws APIManagementException;
      public Response getAPIThumbnail(String apiId, String organizationId, String ifNoneMatch, MessageContext messageContext) throws APIManagementException;
      public Response getAllAPIMediationPolicies(String apiId, String organizationId, Integer limit, Integer offset, String query, String ifNoneMatch, MessageContext messageContext) throws APIManagementException;
      public Response getAllAPIs(String organizationId, Integer limit, Integer offset, String xWSO2Tenant, String query, String ifNoneMatch, Boolean expand, String accept, MessageContext messageContext) throws APIManagementException;
      public Response getAllCommentsOfAPI(String apiId, String xWSO2Tenant, Integer limit, Integer offset, Boolean includeCommenterInfo, MessageContext messageContext) throws APIManagementException;
      public Response getAllPublishedExternalStoresByAPI(String apiId, String organizationId, String ifNoneMatch, MessageContext messageContext) throws APIManagementException;
      public Response getAmazonResourceNamesOfAPI(String apiId, String organizationId, MessageContext messageContext) throws APIManagementException;
      public Response getAuditReportOfAPI(String apiId, String organizationId, String accept, MessageContext messageContext) throws APIManagementException;
      public Response getCommentOfAPI(String commentId, String apiId, String xWSO2Tenant, String ifNoneMatch, Boolean includeCommenterInfo, Integer replyLimit, Integer replyOffset, MessageContext messageContext) throws APIManagementException;
      public Response getGeneratedMockScriptsOfAPI(String apiId, String organizationId, String ifNoneMatch, MessageContext messageContext) throws APIManagementException;
      public Response getGraphQLPolicyComplexityOfAPI(String apiId, String organizationId, MessageContext messageContext) throws APIManagementException;
      public Response getGraphQLPolicyComplexityTypesOfAPI(String apiId, String organizationId, MessageContext messageContext) throws APIManagementException;
      public Response getRepliesOfComment(String commentId, String apiId, String xWSO2Tenant, Integer limit, Integer offset, String ifNoneMatch, Boolean includeCommenterInfo, MessageContext messageContext) throws APIManagementException;
      public Response getWSDLInfoOfAPI(String apiId, String organizationId, MessageContext messageContext) throws APIManagementException;
      public Response getWSDLOfAPI(String apiId, String organizationId, String ifNoneMatch, MessageContext messageContext) throws APIManagementException;
      public Response importAPI(InputStream fileInputStream, Attachment fileDetail, String organizationId, Boolean preserveProvider, Boolean rotateRevision, Boolean overwrite, MessageContext messageContext) throws APIManagementException;
      public Response importAsyncAPISpecification(String organizationId, InputStream fileInputStream, Attachment fileDetail, String url, String additionalProperties, MessageContext messageContext) throws APIManagementException;
      public Response importGraphQLSchema(String organizationId, String ifMatch, String type, InputStream fileInputStream, Attachment fileDetail, String additionalProperties, MessageContext messageContext) throws APIManagementException;
      public Response importOpenAPIDefinition(String organizationId, Boolean importScopes, InputStream fileInputStream, Attachment fileDetail, String url, String additionalProperties, String inlineAPIDefinition, MessageContext messageContext) throws APIManagementException;
      public Response importServiceFromCatalog(String serviceKey, String organizationId, APIDTO APIDTO, MessageContext messageContext) throws APIManagementException;
      public Response importWSDLDefinition(String organizationId, InputStream fileInputStream, Attachment fileDetail, String url, String additionalProperties, String implementationType, MessageContext messageContext) throws APIManagementException;
      public Response publishAPIToExternalStores(String apiId, String externalStoreIds, String organizationId, String ifMatch, MessageContext messageContext) throws APIManagementException;
      public Response reimportServiceFromCatalog(String apiId, String organizationId, MessageContext messageContext) throws APIManagementException;
      public Response restoreAPIRevision(String apiId, String organizationId, String revisionId, MessageContext messageContext) throws APIManagementException;
      public Response undeployAPIRevision(String apiId, String revisionId, String revisionNumber, String organizationId, Boolean allEnvironments, List<APIRevisionDeploymentDTO> apIRevisionDeploymentDTO, MessageContext messageContext) throws APIManagementException;
      public Response updateAPI(String apiId, APIDTO APIDTO, String organizationId, String ifMatch, MessageContext messageContext) throws APIManagementException;
      public Response updateAPIClientCertificateByAlias(String alias, String apiId, String organizationId, InputStream certificateInputStream, Attachment certificateDetail, String tier, MessageContext messageContext) throws APIManagementException;
      public Response updateAPIDeployment(String apiId, String deploymentId, APIRevisionDeploymentDTO apIRevisionDeploymentDTO, MessageContext messageContext) throws APIManagementException;
      public Response updateAPIDocument(String apiId, String documentId, DocumentDTO documentDTO, String organizationId, String ifMatch, MessageContext messageContext) throws APIManagementException;
      public Response updateAPIGraphQLSchema(String apiId, String schemaDefinition, String organizationId, String ifMatch, MessageContext messageContext) throws APIManagementException;
      public Response updateAPIMediationPolicyContentByPolicyId(String apiId, String mediationPolicyId, String type, String organizationId, String ifMatch, InputStream fileInputStream, Attachment fileDetail, String inlineContent, MessageContext messageContext) throws APIManagementException;
      public Response updateAPIResourcePoliciesByPolicyId(String apiId, String resourcePolicyId, ResourcePolicyInfoDTO resourcePolicyInfoDTO, String organizationId, String ifMatch, MessageContext messageContext) throws APIManagementException;
      public Response updateAPISwagger(String apiId, String organizationId, String ifMatch, Boolean importScopes, String apiDefinition, String url, InputStream fileInputStream, Attachment fileDetail, MessageContext messageContext) throws APIManagementException;
      public Response updateAPIThumbnail(String apiId, InputStream fileInputStream, Attachment fileDetail, String organizationId, String ifMatch, MessageContext messageContext) throws APIManagementException;
      public Response updateGraphQLPolicyComplexityOfAPI(String apiId, String organizationId, GraphQLQueryComplexityInfoDTO graphQLQueryComplexityInfoDTO, MessageContext messageContext) throws APIManagementException;
      public Response updateTopics(String apiId, TopicListDTO topicListDTO, String ifMatch, MessageContext messageContext) throws APIManagementException;
      public Response updateWSDLOfAPI(String apiId, String organizationId, String ifMatch, InputStream fileInputStream, Attachment fileDetail, String url, MessageContext messageContext) throws APIManagementException;
      public Response validateAPI(String query, String organizationId, String ifNoneMatch, MessageContext messageContext) throws APIManagementException;
      public Response validateAsyncAPISpecification(Boolean returnContent, String url, InputStream fileInputStream, Attachment fileDetail, MessageContext messageContext) throws APIManagementException;
      public Response validateDocument(String apiId, String name, String organizationId, String ifMatch, MessageContext messageContext) throws APIManagementException;
      public Response validateEndpoint(String endpointUrl, String apiId, MessageContext messageContext) throws APIManagementException;
      public Response validateGraphQLSchema(InputStream fileInputStream, Attachment fileDetail, MessageContext messageContext) throws APIManagementException;
      public Response validateOpenAPIDefinition(Boolean returnContent, String url, InputStream fileInputStream, Attachment fileDetail, String inlineAPIDefinition, MessageContext messageContext) throws APIManagementException;
      public Response validateWSDLDefinition(String url, InputStream fileInputStream, Attachment fileDetail, MessageContext messageContext) throws APIManagementException;
}
