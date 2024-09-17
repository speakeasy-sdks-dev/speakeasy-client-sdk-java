/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.models.shared.GithubConfigureCodeSamplesRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.GithubConfigureMintlifyRepoRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.GithubConfigureTargetRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.GithubStorePublishingSecretsRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.GithubTriggerActionRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.PreflightRequest;
import dev.speakeasyapi.javaclientsdk.utils.Options;
import java.util.Optional;

public class SDKMethodInterfaces {


    public interface MethodCallDeleteApi {
        dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiResponse deleteApi(
            DeleteApiRequest request) throws Exception;
    }


    public interface MethodCallGenerateOpenApiSpec {
        dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecResponse generateOpenApiSpec(
            GenerateOpenApiSpecRequest request) throws Exception;
    }


    public interface MethodCallGeneratePostmanCollection {
        dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionResponse generatePostmanCollection(
            GeneratePostmanCollectionRequest request) throws Exception;
    }


    public interface MethodCallGetAllApiVersions {
        dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsResponse getAllApiVersions(
            GetAllApiVersionsRequest request) throws Exception;
    }


    public interface MethodCallGetApis {
        dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse getApis(
            GetApisRequest request) throws Exception;
    }


    public interface MethodCallUpsertApi {
        dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiResponse upsertApi(
            UpsertApiRequest request) throws Exception;
    }


    public interface MethodCallDeleteApiEndpoint {
        dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiEndpointResponse deleteApiEndpoint(
            DeleteApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallFindApiEndpoint {
        dev.speakeasyapi.javaclientsdk.models.operations.FindApiEndpointResponse findApiEndpoint(
            FindApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallGenerateOpenApiSpecForApiEndpoint {
        dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse generateOpenApiSpecForApiEndpoint(
            GenerateOpenApiSpecForApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallGeneratePostmanCollectionForApiEndpoint {
        dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse generatePostmanCollectionForApiEndpoint(
            GeneratePostmanCollectionForApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallGetAllApiEndpoints {
        dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsResponse getAllApiEndpoints(
            GetAllApiEndpointsRequest request) throws Exception;
    }


    public interface MethodCallGetAllForVersionApiEndpoints {
        dev.speakeasyapi.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse getAllForVersionApiEndpoints(
            GetAllForVersionApiEndpointsRequest request) throws Exception;
    }


    public interface MethodCallGetApiEndpoint {
        dev.speakeasyapi.javaclientsdk.models.operations.GetApiEndpointResponse getApiEndpoint(
            GetApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallUpsertApiEndpoint {
        dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiEndpointResponse upsertApiEndpoint(
            UpsertApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallDeleteVersionMetadata {
        dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataResponse deleteVersionMetadata(
            DeleteVersionMetadataRequest request) throws Exception;
    }


    public interface MethodCallGetVersionMetadata {
        dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataResponse getVersionMetadata(
            GetVersionMetadataRequest request) throws Exception;
    }


    public interface MethodCallInsertVersionMetadata {
        dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataResponse insertVersionMetadata(
            InsertVersionMetadataRequest request) throws Exception;
    }


    public interface MethodCallDeleteSchema {
        dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaResponse deleteSchema(
            DeleteSchemaRequest request) throws Exception;
    }


    public interface MethodCallDownloadSchema {
        dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaResponse downloadSchema(
            DownloadSchemaRequest request) throws Exception;
    }


    public interface MethodCallDownloadSchemaRevision {
        dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionResponse downloadSchemaRevision(
            DownloadSchemaRevisionRequest request) throws Exception;
    }


    public interface MethodCallGetSchema {
        dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaResponse getSchema(
            GetSchemaRequest request) throws Exception;
    }


    public interface MethodCallGetSchemaDiff {
        dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffResponse getSchemaDiff(
            GetSchemaDiffRequest request) throws Exception;
    }


    public interface MethodCallGetSchemaRevision {
        dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionResponse getSchemaRevision(
            GetSchemaRevisionRequest request) throws Exception;
    }


    public interface MethodCallGetSchemas {
        dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasResponse getSchemas(
            GetSchemasRequest request) throws Exception;
    }


    public interface MethodCallRegisterSchema {
        dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaResponse registerSchema(
            RegisterSchemaRequest request) throws Exception;
    }


    public interface MethodCallGetBlob {
        dev.speakeasyapi.javaclientsdk.models.operations.GetBlobResponse getBlob(
            GetBlobRequest request) throws Exception;
    }


    public interface MethodCallGetManifest {
        dev.speakeasyapi.javaclientsdk.models.operations.GetManifestResponse getManifest(
            GetManifestRequest request) throws Exception;
    }


    public interface MethodCallGetNamespaces {
        dev.speakeasyapi.javaclientsdk.models.operations.GetNamespacesResponse getNamespacesDirect() throws Exception;
    }


    public interface MethodCallGetOASSummary {
        dev.speakeasyapi.javaclientsdk.models.operations.GetOASSummaryResponse getOASSummary(
            GetOASSummaryRequest request) throws Exception;
    }


    public interface MethodCallGetRevisions {
        dev.speakeasyapi.javaclientsdk.models.operations.GetRevisionsResponse getRevisions(
            GetRevisionsRequest request) throws Exception;
    }


    public interface MethodCallGetTags {
        dev.speakeasyapi.javaclientsdk.models.operations.GetTagsResponse getTags(
            GetTagsRequest request) throws Exception;
    }


    public interface MethodCallPostTags {
        dev.speakeasyapi.javaclientsdk.models.operations.PostTagsResponse postTags(
            PostTagsRequest request) throws Exception;
    }


    public interface MethodCallPreflight {
        dev.speakeasyapi.javaclientsdk.models.operations.PreflightResponse preflight(
            Optional<? extends PreflightRequest> request) throws Exception;
    }


    public interface MethodCallGetAccessToken {
        dev.speakeasyapi.javaclientsdk.models.operations.GetAccessTokenResponse getAccessToken(
            GetAccessTokenRequest request) throws Exception;
    }


    public interface MethodCallGetUser {
        dev.speakeasyapi.javaclientsdk.models.operations.GetUserResponse getUserDirect() throws Exception;
    }


    public interface MethodCallGetWorkspaceAccess {
        dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceAccessResponse getWorkspaceAccess(
            GetWorkspaceAccessRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallValidateApiKey {
        dev.speakeasyapi.javaclientsdk.models.operations.ValidateApiKeyResponse validateApiKeyDirect() throws Exception;
    }


    public interface MethodCallGenerateRequestPostmanCollection {
        dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse generateRequestPostmanCollection(
            GenerateRequestPostmanCollectionRequest request) throws Exception;
    }


    public interface MethodCallGetRequestFromEventLog {
        dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogResponse getRequestFromEventLog(
            GetRequestFromEventLogRequest request) throws Exception;
    }


    public interface MethodCallQueryEventLog {
        dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogResponse queryEventLog(
            QueryEventLogRequest request) throws Exception;
    }


    public interface MethodCallCheckAccess {
        dev.speakeasyapi.javaclientsdk.models.operations.CheckAccessResponse checkAccess(
            CheckAccessRequest request) throws Exception;
    }


    public interface MethodCallConfigureCodeSamples {
        dev.speakeasyapi.javaclientsdk.models.operations.ConfigureCodeSamplesResponse configureCodeSamples(
            GithubConfigureCodeSamplesRequest request) throws Exception;
    }


    public interface MethodCallConfigureMintlifyRepo {
        dev.speakeasyapi.javaclientsdk.models.operations.ConfigureMintlifyRepoResponse configureMintlifyRepo(
            GithubConfigureMintlifyRepoRequest request) throws Exception;
    }


    public interface MethodCallConfigureTarget {
        dev.speakeasyapi.javaclientsdk.models.operations.ConfigureTargetResponse configureTarget(
            GithubConfigureTargetRequest request) throws Exception;
    }


    public interface MethodCallFetchPublishingPRs {
        dev.speakeasyapi.javaclientsdk.models.operations.FetchPublishingPRsResponse fetchPublishingPRs(
            FetchPublishingPRsRequest request) throws Exception;
    }


    public interface MethodCallGetAction {
        dev.speakeasyapi.javaclientsdk.models.operations.GetActionResponse getAction(
            GetActionRequest request) throws Exception;
    }


    public interface MethodCallGithubCheckPublishingSecrets {
        dev.speakeasyapi.javaclientsdk.models.operations.GithubCheckPublishingSecretsResponse githubCheckPublishingSecrets(
            GithubCheckPublishingSecretsRequest request) throws Exception;
    }


    public interface MethodCallGithubStorePublishingSecrets {
        dev.speakeasyapi.javaclientsdk.models.operations.GithubStorePublishingSecretsResponse githubStorePublishingSecrets(
            GithubStorePublishingSecretsRequest request) throws Exception;
    }


    public interface MethodCallTriggerAction {
        dev.speakeasyapi.javaclientsdk.models.operations.TriggerActionResponse triggerAction(
            GithubTriggerActionRequest request) throws Exception;
    }


    public interface MethodCallCreateFreeTrial {
        dev.speakeasyapi.javaclientsdk.models.operations.CreateFreeTrialResponse createFreeTrialDirect() throws Exception;
    }


    public interface MethodCallGetOrganization {
        dev.speakeasyapi.javaclientsdk.models.operations.GetOrganizationResponse getOrganization(
            GetOrganizationRequest request) throws Exception;
    }


    public interface MethodCallGetOrganizationUsage {
        dev.speakeasyapi.javaclientsdk.models.operations.GetOrganizationUsageResponse getOrganizationUsageDirect() throws Exception;
    }


    public interface MethodCallGetOrganizations {
        dev.speakeasyapi.javaclientsdk.models.operations.GetOrganizationsResponse getOrganizationsDirect() throws Exception;
    }


    public interface MethodCallGetChangesReportSignedUrl {
        dev.speakeasyapi.javaclientsdk.models.operations.GetChangesReportSignedUrlResponse getChangesReportSignedUrl(
            GetChangesReportSignedUrlRequest request) throws Exception;
    }


    public interface MethodCallGetLintingReportSignedUrl {
        dev.speakeasyapi.javaclientsdk.models.operations.GetLintingReportSignedUrlResponse getLintingReportSignedUrl(
            GetLintingReportSignedUrlRequest request) throws Exception;
    }


    public interface MethodCallUploadReport {
        dev.speakeasyapi.javaclientsdk.models.operations.UploadReportResponse uploadReport(
            UploadReportRequestBody request) throws Exception;
    }


    public interface MethodCallCreate {
        dev.speakeasyapi.javaclientsdk.models.operations.CreateResponse create(
            CreateRequestBody request) throws Exception;
    }


    public interface MethodCallSuggest {
        dev.speakeasyapi.javaclientsdk.models.operations.SuggestResponse suggest(
            SuggestRequest request) throws Exception;
    }


    public interface MethodCallSuggestOpenAPI {
        dev.speakeasyapi.javaclientsdk.models.operations.SuggestOpenAPIResponse suggestOpenAPI(
            SuggestOpenAPIRequest request) throws Exception;
    }


    public interface MethodCallSuggestOpenAPIRegistry {
        dev.speakeasyapi.javaclientsdk.models.operations.SuggestOpenAPIRegistryResponse suggestOpenAPIRegistry(
            SuggestOpenAPIRegistryRequest request) throws Exception;
    }


    public interface MethodCallGetEmbedAccessToken {
        dev.speakeasyapi.javaclientsdk.models.operations.GetEmbedAccessTokenResponse getEmbedAccessToken(
            GetEmbedAccessTokenRequest request) throws Exception;
    }


    public interface MethodCallGetValidEmbedAccessTokens {
        dev.speakeasyapi.javaclientsdk.models.operations.GetValidEmbedAccessTokensResponse getValidEmbedAccessTokensDirect() throws Exception;
    }


    public interface MethodCallRevokeEmbedAccessToken {
        dev.speakeasyapi.javaclientsdk.models.operations.RevokeEmbedAccessTokenResponse revokeEmbedAccessToken(
            RevokeEmbedAccessTokenRequest request) throws Exception;
    }


    public interface MethodCallGetWorkspace {
        dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceResponse getWorkspace(
            GetWorkspaceRequest request) throws Exception;
    }


    public interface MethodCallGetWorkspaceFeatureFlags {
        dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceFeatureFlagsResponse getWorkspaceFeatureFlags(
            GetWorkspaceFeatureFlagsRequest request) throws Exception;
    }


    public interface MethodCallGetWorkspaceEventsByTarget {
        dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceEventsByTargetResponse getWorkspaceEventsByTarget(
            GetWorkspaceEventsByTargetRequest request) throws Exception;
    }


    public interface MethodCallGetWorkspaceTargets {
        dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceTargetsResponse getWorkspaceTargets(
            GetWorkspaceTargetsRequest request) throws Exception;
    }


    public interface MethodCallPostWorkspaceEvents {
        dev.speakeasyapi.javaclientsdk.models.operations.PostWorkspaceEventsResponse postWorkspaceEvents(
            PostWorkspaceEventsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallSearchWorkspaceEvents {
        dev.speakeasyapi.javaclientsdk.models.operations.SearchWorkspaceEventsResponse searchWorkspaceEvents(
            SearchWorkspaceEventsRequest request) throws Exception;
    }


}
