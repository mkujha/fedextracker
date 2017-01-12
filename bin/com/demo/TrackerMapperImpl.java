package com.demo;

import com.demo.domain.WriteEventLogReturn;
import com.demo.fedex.domain.Address;
import com.demo.fedex.domain.AppointmentDetail;
import com.demo.fedex.domain.AppointmentTimeDetail;
import com.demo.fedex.domain.AppointmentWindowType;
import com.demo.fedex.domain.ArrivalLocationType;
import com.demo.fedex.domain.AvailableImageType;
import com.demo.fedex.domain.AvailableImagesDetail;
import com.demo.fedex.domain.CarrierCodeType;
import com.demo.fedex.domain.Commodity;
import com.demo.fedex.domain.CommodityPurposeType;
import com.demo.fedex.domain.CompletedTrackDetail;
import com.demo.fedex.domain.Contact;
import com.demo.fedex.domain.ContactAndAddress;
import com.demo.fedex.domain.ContentRecord;
import com.demo.fedex.domain.CustomerExceptionRequestDetail;
import com.demo.fedex.domain.CustomsOptionDetail;
import com.demo.fedex.domain.CustomsOptionType;
import com.demo.fedex.domain.DateRange;
import com.demo.fedex.domain.DeliveryOptionEligibilityDetail;
import com.demo.fedex.domain.DeliveryOptionType;
import com.demo.fedex.domain.Dimensions;
import com.demo.fedex.domain.Distance;
import com.demo.fedex.domain.DistanceUnits;
import com.demo.fedex.domain.EdtExciseCondition;
import com.demo.fedex.domain.EligibilityType;
import com.demo.fedex.domain.FedExLocationType;
import com.demo.fedex.domain.ImageSizeType;
import com.demo.fedex.domain.LinearUnits;
import com.demo.fedex.domain.LocalTimeRange;
import com.demo.fedex.domain.Localization;
import com.demo.fedex.domain.Measure;
import com.demo.fedex.domain.Money;
import com.demo.fedex.domain.NaftaCommodityDetail;
import com.demo.fedex.domain.NaftaNetCostMethodCode;
import com.demo.fedex.domain.NaftaPreferenceCriterionCode;
import com.demo.fedex.domain.NaftaProducerDeterminationCode;
import com.demo.fedex.domain.Notification;
import com.demo.fedex.domain.NotificationEventType;
import com.demo.fedex.domain.NotificationParameter;
import com.demo.fedex.domain.NotificationSeverityType;
import com.demo.fedex.domain.OfficeOrderDeliveryMethodType;
import com.demo.fedex.domain.OperatingCompanyType;
import com.demo.fedex.domain.PackagingType;
import com.demo.fedex.domain.PhysicalPackagingType;
import com.demo.fedex.domain.PieceCountLocationType;
import com.demo.fedex.domain.PieceCountVerificationDetail;
import com.demo.fedex.domain.ServiceType;
import com.demo.fedex.domain.SignatureImageDetail;
import com.demo.fedex.domain.SpecialInstructionStatusDetail;
import com.demo.fedex.domain.SpecialInstructionsStatusCode;
import com.demo.fedex.domain.StringBarcode;
import com.demo.fedex.domain.StringBarcodeType;
import com.demo.fedex.domain.TrackAdvanceNotificationDetail;
import com.demo.fedex.domain.TrackAdvanceNotificationStatusType;
import com.demo.fedex.domain.TrackChargeDetail;
import com.demo.fedex.domain.TrackChargeDetailType;
import com.demo.fedex.domain.TrackChargesPaymentClassificationType;
import com.demo.fedex.domain.TrackDeliveryLocationType;
import com.demo.fedex.domain.TrackDeliveryOptionType;
import com.demo.fedex.domain.TrackDetail;
import com.demo.fedex.domain.TrackDetailAttributeType;
import com.demo.fedex.domain.TrackEvent;
import com.demo.fedex.domain.TrackIdentifierType;
import com.demo.fedex.domain.TrackInformationNoteDetail;
import com.demo.fedex.domain.TrackOtherIdentifierDetail;
import com.demo.fedex.domain.TrackPackageIdentifier;
import com.demo.fedex.domain.TrackPayment;
import com.demo.fedex.domain.TrackPaymentType;
import com.demo.fedex.domain.TrackPossessionStatusType;
import com.demo.fedex.domain.TrackReconciliation;
import com.demo.fedex.domain.TrackReply;
import com.demo.fedex.domain.TrackReturnDetail;
import com.demo.fedex.domain.TrackReturnLabelType;
import com.demo.fedex.domain.TrackReturnMovementStatusType;
import com.demo.fedex.domain.TrackServiceDescriptionDetail;
import com.demo.fedex.domain.TrackSpecialHandling;
import com.demo.fedex.domain.TrackSpecialHandlingType;
import com.demo.fedex.domain.TrackSpecialInstruction;
import com.demo.fedex.domain.TrackSplitShipmentPart;
import com.demo.fedex.domain.TrackStatusAncillaryDetail;
import com.demo.fedex.domain.TrackStatusDetail;
import com.demo.fedex.domain.TrackingDateOrTimestamp;
import com.demo.fedex.domain.TrackingDateOrTimestampType;
import com.demo.fedex.domain.TransactionDetail;
import com.demo.fedex.domain.VersionId;
import com.demo.fedex.domain.Weight;
import com.demo.fedex.domain.WeightUnits;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-01-12T09:55:44-0500",
    comments = "version: 1.0.0.Final, compiler: javac, environment: Java 1.8.0_112 (Oracle Corporation)"
)
public class TrackerMapperImpl implements TrackerMapper {

    @Override
    public WriteEventLogReturn map(TrackReply reply) {
        if ( reply == null ) {
            return null;
        }

        WriteEventLogReturn writeEventLogReturn = new WriteEventLogReturn();

        writeEventLogReturn.setHighestSeverity( map( reply.getHighestSeverity() ) );
        writeEventLogReturn.setTransactionDetail( map( reply.getTransactionDetail() ) );
        writeEventLogReturn.setVersion( map( reply.getVersion() ) );
        if ( writeEventLogReturn.getNotifications() != null ) {
            Collection<com.demo.domain.Notification> targetCollection = map( reply.getNotifications() );
            if ( targetCollection != null ) {
                writeEventLogReturn.getNotifications().addAll( targetCollection );
            }
        }
        if ( writeEventLogReturn.getCompletedTrackDetails() != null ) {
            Collection<com.demo.domain.CompletedTrackDetail> targetCollection_ = map1( reply.getCompletedTrackDetails() );
            if ( targetCollection_ != null ) {
                writeEventLogReturn.getCompletedTrackDetails().addAll( targetCollection_ );
            }
        }

        return writeEventLogReturn;
    }

    @Override
    public com.demo.domain.NotificationSeverityType map(NotificationSeverityType reply) {
        if ( reply == null ) {
            return  null;
        }

        com.demo.domain.NotificationSeverityType notificationSeverityType_;

        switch ( reply ) {
            case ERROR: notificationSeverityType_ = com.demo.domain.NotificationSeverityType.ERROR;
            break;
            case FAILURE: notificationSeverityType_ = com.demo.domain.NotificationSeverityType.FAILURE;
            break;
            case NOTE: notificationSeverityType_ = com.demo.domain.NotificationSeverityType.NOTE;
            break;
            case SUCCESS: notificationSeverityType_ = com.demo.domain.NotificationSeverityType.SUCCESS;
            break;
            case WARNING: notificationSeverityType_ = com.demo.domain.NotificationSeverityType.WARNING;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + reply );
        }

        return notificationSeverityType_;
    }
    @Override
    public com.demo.domain.Notification map(Notification reply) {
        if ( reply == null ) {
            return null;
        }

        com.demo.domain.Notification notification = new com.demo.domain.Notification();

        notification.setSeverity( map( reply.getSeverity() ) );
        notification.setSource( map( reply.getSource() ) );
        notification.setCode( map( reply.getCode() ) );
        notification.setMessage( map( reply.getMessage() ) );
        notification.setLocalizedMessage( map( reply.getLocalizedMessage() ) );
        if ( notification.getMessageParameters() != null ) {
            Collection<com.demo.domain.NotificationParameter> targetCollection = map23( reply.getMessageParameters() );
            if ( targetCollection != null ) {
                notification.getMessageParameters().addAll( targetCollection );
            }
        }

        return notification;
    }

    @Override
    public com.demo.domain.TransactionDetail map(TransactionDetail reply) {
        if ( reply == null ) {
            return null;
        }

        com.demo.domain.TransactionDetail transactionDetail_ = new com.demo.domain.TransactionDetail();

        transactionDetail_.setCustomerTransactionId( map( reply.getCustomerTransactionId() ) );
        transactionDetail_.setLocalization( map( reply.getLocalization() ) );

        return transactionDetail_;
    }

    @Override
    public com.demo.domain.VersionId map(VersionId reply) {
        if ( reply == null ) {
            return null;
        }

        com.demo.domain.VersionId versionId_ = new com.demo.domain.VersionId();

        versionId_.setServiceId( map( reply.getServiceId() ) );
        versionId_.setMajor( reply.getMajor() );
        versionId_.setIntermediate( reply.getIntermediate() );
        versionId_.setMinor( reply.getMinor() );

        return versionId_;
    }

    @Override
    public List<com.demo.domain.Notification> map(List<Notification> reply) {
        if ( reply == null ) {
            return null;
        }

        List<com.demo.domain.Notification> list_ = new ArrayList<com.demo.domain.Notification>();
        for ( Notification notification : reply ) {
            list_.add( map( notification ) );
        }

        return list_;
    }

    @Override
    public List<com.demo.domain.CompletedTrackDetail> map1(List<CompletedTrackDetail> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.CompletedTrackDetail> list_ = new ArrayList<com.demo.domain.CompletedTrackDetail>();
        for ( CompletedTrackDetail completedTrackDetail : value ) {
            list_.add( map( completedTrackDetail ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.CompletedTrackDetail map(CompletedTrackDetail value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.CompletedTrackDetail completedTrackDetail_ = new com.demo.domain.CompletedTrackDetail();

        completedTrackDetail_.setHighestSeverity( map( value.getHighestSeverity() ) );
        completedTrackDetail_.setDuplicateWaybill( value.isDuplicateWaybill() );
        completedTrackDetail_.setMoreData( value.isMoreData() );
        completedTrackDetail_.setPagingToken( map( value.getPagingToken() ) );
        completedTrackDetail_.setTrackDetailsCount( value.getTrackDetailsCount() );
        if ( completedTrackDetail_.getNotifications() != null ) {
            Collection<com.demo.domain.Notification> targetCollection = map( value.getNotifications() );
            if ( targetCollection != null ) {
                completedTrackDetail_.getNotifications().addAll( targetCollection );
            }
        }
        if ( completedTrackDetail_.getTrackDetails() != null ) {
            Collection<com.demo.domain.TrackDetail> targetCollection_ = map3( value.getTrackDetails() );
            if ( targetCollection_ != null ) {
                completedTrackDetail_.getTrackDetails().addAll( targetCollection_ );
            }
        }

        return completedTrackDetail_;
    }

    @Override
    public List<com.demo.domain.TrackDetail> map3(List<TrackDetail> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.TrackDetail> list_ = new ArrayList<com.demo.domain.TrackDetail>();
        for ( TrackDetail trackDetail : value ) {
            list_.add( map( trackDetail ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.TrackDetail map(TrackDetail reply) {
        if ( reply == null ) {
            return null;
        }

        com.demo.domain.TrackDetail trackDetail_ = new com.demo.domain.TrackDetail();

        trackDetail_.setNotification( map( reply.getNotification() ) );
        trackDetail_.setTrackingNumber( map( reply.getTrackingNumber() ) );
        trackDetail_.setBarcode( map( reply.getBarcode() ) );
        trackDetail_.setTrackingNumberUniqueIdentifier( map( reply.getTrackingNumberUniqueIdentifier() ) );
        trackDetail_.setStatusDetail( map( reply.getStatusDetail() ) );
        trackDetail_.setReconciliation( map( reply.getReconciliation() ) );
        trackDetail_.setServiceCommitMessage( map( reply.getServiceCommitMessage() ) );
        trackDetail_.setDestinationServiceArea( map( reply.getDestinationServiceArea() ) );
        trackDetail_.setDestinationServiceAreaDescription( map( reply.getDestinationServiceAreaDescription() ) );
        trackDetail_.setCarrierCode( map( reply.getCarrierCode() ) );
        trackDetail_.setOperatingCompany( map( reply.getOperatingCompany() ) );
        trackDetail_.setOperatingCompanyOrCarrierDescription( map( reply.getOperatingCompanyOrCarrierDescription() ) );
        trackDetail_.setCartageAgentCompanyName( map( reply.getCartageAgentCompanyName() ) );
        trackDetail_.setProductionLocationContactAndAddress( map( reply.getProductionLocationContactAndAddress() ) );
        trackDetail_.setFormId( map( reply.getFormId() ) );
        trackDetail_.setService( map( reply.getService() ) );
        trackDetail_.setPackageWeight( map( reply.getPackageWeight() ) );
        trackDetail_.setPackageDimensions( map( reply.getPackageDimensions() ) );
        trackDetail_.setPackageDimensionalWeight( map( reply.getPackageDimensionalWeight() ) );
        trackDetail_.setShipmentWeight( map( reply.getShipmentWeight() ) );
        trackDetail_.setPackaging( map( reply.getPackaging() ) );
        trackDetail_.setPackagingType( map( reply.getPackagingType() ) );
        trackDetail_.setPhysicalPackagingType( map( reply.getPhysicalPackagingType() ) );
        trackDetail_.setPackageSequenceNumber( reply.getPackageSequenceNumber() );
        trackDetail_.setPackageCount( reply.getPackageCount() );
        trackDetail_.setCreatorSoftwareId( map( reply.getCreatorSoftwareId() ) );
        trackDetail_.setNickName( map( reply.getNickName() ) );
        trackDetail_.setNotes( map( reply.getNotes() ) );
        trackDetail_.setClearanceLocationCode( map( reply.getClearanceLocationCode() ) );
        trackDetail_.setReturnDetail( map( reply.getReturnDetail() ) );
        trackDetail_.setAdvanceNotificationDetail( map( reply.getAdvanceNotificationDetail() ) );
        trackDetail_.setShipper( map( reply.getShipper() ) );
        trackDetail_.setPossessionStatus( map( reply.getPossessionStatus() ) );
        trackDetail_.setShipperAddress( map( reply.getShipperAddress() ) );
        trackDetail_.setOriginLocationAddress( map( reply.getOriginLocationAddress() ) );
        trackDetail_.setOriginStationId( map( reply.getOriginStationId() ) );
        trackDetail_.setTotalTransitDistance( map( reply.getTotalTransitDistance() ) );
        trackDetail_.setDistanceToDestination( map( reply.getDistanceToDestination() ) );
        trackDetail_.setRecipient( map( reply.getRecipient() ) );
        trackDetail_.setLastUpdatedDestinationAddress( map( reply.getLastUpdatedDestinationAddress() ) );
        trackDetail_.setDestinationAddress( map( reply.getDestinationAddress() ) );
        trackDetail_.setHoldAtLocationContact( map( reply.getHoldAtLocationContact() ) );
        trackDetail_.setHoldAtLocationAddress( map( reply.getHoldAtLocationAddress() ) );
        trackDetail_.setDestinationStationId( map( reply.getDestinationStationId() ) );
        trackDetail_.setDestinationLocationAddress( map( reply.getDestinationLocationAddress() ) );
        trackDetail_.setDestinationLocationType( map( reply.getDestinationLocationType() ) );
        trackDetail_.setDestinationLocationTimeZoneOffset( map( reply.getDestinationLocationTimeZoneOffset() ) );
        trackDetail_.setActualDeliveryAddress( map( reply.getActualDeliveryAddress() ) );
        trackDetail_.setOfficeOrderDeliveryMethod( map( reply.getOfficeOrderDeliveryMethod() ) );
        trackDetail_.setDeliveryLocationType( map( reply.getDeliveryLocationType() ) );
        trackDetail_.setDeliveryLocationDescription( map( reply.getDeliveryLocationDescription() ) );
        trackDetail_.setDeliveryAttempts( reply.getDeliveryAttempts() );
        trackDetail_.setDeliverySignatureName( map( reply.getDeliverySignatureName() ) );
        trackDetail_.setTotalUniqueAddressCountInConsolidation( reply.getTotalUniqueAddressCountInConsolidation() );
        trackDetail_.setSignature( map( reply.getSignature() ) );
        if ( trackDetail_.getInformationNotes() != null ) {
            Collection<com.demo.domain.TrackInformationNoteDetail> targetCollection = map4( reply.getInformationNotes() );
            if ( targetCollection != null ) {
                trackDetail_.getInformationNotes().addAll( targetCollection );
            }
        }
        if ( trackDetail_.getCustomerExceptionRequests() != null ) {
            Collection<com.demo.domain.CustomerExceptionRequestDetail> targetCollection_ = map5( reply.getCustomerExceptionRequests() );
            if ( targetCollection_ != null ) {
                trackDetail_.getCustomerExceptionRequests().addAll( targetCollection_ );
            }
        }
        if ( trackDetail_.getOtherIdentifiers() != null ) {
            Collection<com.demo.domain.TrackOtherIdentifierDetail> targetCollection__ = map6( reply.getOtherIdentifiers() );
            if ( targetCollection__ != null ) {
                trackDetail_.getOtherIdentifiers().addAll( targetCollection__ );
            }
        }
        if ( trackDetail_.getCharges() != null ) {
            Collection<com.demo.domain.TrackChargeDetail> targetCollection___ = map7( reply.getCharges() );
            if ( targetCollection___ != null ) {
                trackDetail_.getCharges().addAll( targetCollection___ );
            }
        }
        if ( trackDetail_.getAttributes() != null ) {
            Collection<com.demo.domain.TrackDetailAttributeType> targetCollection____ = map8( reply.getAttributes() );
            if ( targetCollection____ != null ) {
                trackDetail_.getAttributes().addAll( targetCollection____ );
            }
        }
        if ( trackDetail_.getShipmentContents() != null ) {
            Collection<com.demo.domain.ContentRecord> targetCollection_____ = map9( reply.getShipmentContents() );
            if ( targetCollection_____ != null ) {
                trackDetail_.getShipmentContents().addAll( targetCollection_____ );
            }
        }
        if ( trackDetail_.getPackageContents() != null ) {
            Collection<String> targetCollection______ = map10( reply.getPackageContents() );
            if ( targetCollection______ != null ) {
                trackDetail_.getPackageContents().addAll( targetCollection______ );
            }
        }
        if ( trackDetail_.getCommodities() != null ) {
            Collection<com.demo.domain.Commodity> targetCollection_______ = map11( reply.getCommodities() );
            if ( targetCollection_______ != null ) {
                trackDetail_.getCommodities().addAll( targetCollection_______ );
            }
        }
        if ( trackDetail_.getCustomsOptionDetails() != null ) {
            Collection<com.demo.domain.CustomsOptionDetail> targetCollection________ = map12( reply.getCustomsOptionDetails() );
            if ( targetCollection________ != null ) {
                trackDetail_.getCustomsOptionDetails().addAll( targetCollection________ );
            }
        }
        if ( trackDetail_.getSpecialHandlings() != null ) {
            Collection<com.demo.domain.TrackSpecialHandling> targetCollection_________ = map13( reply.getSpecialHandlings() );
            if ( targetCollection_________ != null ) {
                trackDetail_.getSpecialHandlings().addAll( targetCollection_________ );
            }
        }
        if ( trackDetail_.getPayments() != null ) {
            Collection<com.demo.domain.TrackPayment> targetCollection__________ = map14( reply.getPayments() );
            if ( targetCollection__________ != null ) {
                trackDetail_.getPayments().addAll( targetCollection__________ );
            }
        }
        if ( trackDetail_.getDatesOrTimes() != null ) {
            Collection<com.demo.domain.TrackingDateOrTimestamp> targetCollection___________ = map15( reply.getDatesOrTimes() );
            if ( targetCollection___________ != null ) {
                trackDetail_.getDatesOrTimes().addAll( targetCollection___________ );
            }
        }
        if ( trackDetail_.getSpecialInstructions() != null ) {
            Collection<com.demo.domain.TrackSpecialInstruction> targetCollection____________ = map16( reply.getSpecialInstructions() );
            if ( targetCollection____________ != null ) {
                trackDetail_.getSpecialInstructions().addAll( targetCollection____________ );
            }
        }
        if ( trackDetail_.getPieceCountVerificationDetails() != null ) {
            Collection<com.demo.domain.PieceCountVerificationDetail> targetCollection_____________ = map17( reply.getPieceCountVerificationDetails() );
            if ( targetCollection_____________ != null ) {
                trackDetail_.getPieceCountVerificationDetails().addAll( targetCollection_____________ );
            }
        }
        if ( trackDetail_.getAvailableImages() != null ) {
            Collection<com.demo.domain.AvailableImagesDetail> targetCollection______________ = map18( reply.getAvailableImages() );
            if ( targetCollection______________ != null ) {
                trackDetail_.getAvailableImages().addAll( targetCollection______________ );
            }
        }
        if ( trackDetail_.getSplitShipmentParts() != null ) {
            Collection<com.demo.domain.TrackSplitShipmentPart> targetCollection_______________ = map20( reply.getSplitShipmentParts() );
            if ( targetCollection_______________ != null ) {
                trackDetail_.getSplitShipmentParts().addAll( targetCollection_______________ );
            }
        }
        if ( trackDetail_.getDeliveryOptionEligibilityDetails() != null ) {
            Collection<com.demo.domain.DeliveryOptionEligibilityDetail> targetCollection________________ = map21( reply.getDeliveryOptionEligibilityDetails() );
            if ( targetCollection________________ != null ) {
                trackDetail_.getDeliveryOptionEligibilityDetails().addAll( targetCollection________________ );
            }
        }
        if ( trackDetail_.getEvents() != null ) {
            Collection<com.demo.domain.TrackEvent> targetCollection_________________ = map22( reply.getEvents() );
            if ( targetCollection_________________ != null ) {
                trackDetail_.getEvents().addAll( targetCollection_________________ );
            }
        }

        return trackDetail_;
    }

    @Override
    public com.demo.domain.TrackStatusDetail map(TrackStatusDetail reply) {
        if ( reply == null ) {
            return null;
        }

        com.demo.domain.TrackStatusDetail trackStatusDetail_ = new com.demo.domain.TrackStatusDetail();

        trackStatusDetail_.setCreationTime( reply.getCreationTime() );
        trackStatusDetail_.setCode( map( reply.getCode() ) );
        trackStatusDetail_.setDescription( map( reply.getDescription() ) );
        trackStatusDetail_.setLocation( map( reply.getLocation() ) );
        if ( trackStatusDetail_.getAncillaryDetails() != null ) {
            Collection<com.demo.domain.TrackStatusAncillaryDetail> targetCollection = map24( reply.getAncillaryDetails() );
            if ( targetCollection != null ) {
                trackStatusDetail_.getAncillaryDetails().addAll( targetCollection );
            }
        }

        return trackStatusDetail_;
    }

    @Override
    public List<com.demo.domain.TrackInformationNoteDetail> map4(List<TrackInformationNoteDetail> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.TrackInformationNoteDetail> list_ = new ArrayList<com.demo.domain.TrackInformationNoteDetail>();
        for ( TrackInformationNoteDetail trackInformationNoteDetail : value ) {
            list_.add( map( trackInformationNoteDetail ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.TrackInformationNoteDetail map(TrackInformationNoteDetail value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.TrackInformationNoteDetail trackInformationNoteDetail_ = new com.demo.domain.TrackInformationNoteDetail();

        trackInformationNoteDetail_.setCode( map( value.getCode() ) );
        trackInformationNoteDetail_.setDescription( map( value.getDescription() ) );

        return trackInformationNoteDetail_;
    }

    @Override
    public List<com.demo.domain.CustomerExceptionRequestDetail> map5(List<CustomerExceptionRequestDetail> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.CustomerExceptionRequestDetail> list_ = new ArrayList<com.demo.domain.CustomerExceptionRequestDetail>();
        for ( CustomerExceptionRequestDetail customerExceptionRequestDetail : value ) {
            list_.add( map( customerExceptionRequestDetail ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.CustomerExceptionRequestDetail map(CustomerExceptionRequestDetail value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.CustomerExceptionRequestDetail customerExceptionRequestDetail_ = new com.demo.domain.CustomerExceptionRequestDetail();

        customerExceptionRequestDetail_.setId( map( value.getId() ) );
        customerExceptionRequestDetail_.setStatusCode( map( value.getStatusCode() ) );
        customerExceptionRequestDetail_.setStatusDescription( map( value.getStatusDescription() ) );
        customerExceptionRequestDetail_.setCreateTime( value.getCreateTime() );

        return customerExceptionRequestDetail_;
    }

    @Override
    public com.demo.domain.TrackReconciliation map(TrackReconciliation value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.TrackReconciliation trackReconciliation_ = new com.demo.domain.TrackReconciliation();

        trackReconciliation_.setStatus( map( value.getStatus() ) );
        trackReconciliation_.setDescription( map( value.getDescription() ) );

        return trackReconciliation_;
    }

    @Override
    public com.demo.domain.CarrierCodeType map(CarrierCodeType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.CarrierCodeType carrierCodeType_;

        switch ( value ) {
            case FDXC: carrierCodeType_ = com.demo.domain.CarrierCodeType.FDXC;
            break;
            case FDXE: carrierCodeType_ = com.demo.domain.CarrierCodeType.FDXE;
            break;
            case FDXG: carrierCodeType_ = com.demo.domain.CarrierCodeType.FDXG;
            break;
            case FXCC: carrierCodeType_ = com.demo.domain.CarrierCodeType.FXCC;
            break;
            case FXFR: carrierCodeType_ = com.demo.domain.CarrierCodeType.FXFR;
            break;
            case FXSP: carrierCodeType_ = com.demo.domain.CarrierCodeType.FXSP;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return carrierCodeType_;
    }
    @Override
    public com.demo.domain.OperatingCompanyType map(OperatingCompanyType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.OperatingCompanyType operatingCompanyType_;

        switch ( value ) {
            case FEDEX_CARGO: operatingCompanyType_ = com.demo.domain.OperatingCompanyType.FEDEX_CARGO;
            break;
            case FEDEX_CORPORATE_SERVICES: operatingCompanyType_ = com.demo.domain.OperatingCompanyType.FEDEX_CORPORATE_SERVICES;
            break;
            case FEDEX_CORPORATION: operatingCompanyType_ = com.demo.domain.OperatingCompanyType.FEDEX_CORPORATION;
            break;
            case FEDEX_CUSTOMER_INFORMATION_SYSTEMS: operatingCompanyType_ = com.demo.domain.OperatingCompanyType.FEDEX_CUSTOMER_INFORMATION_SYSTEMS;
            break;
            case FEDEX_CUSTOM_CRITICAL: operatingCompanyType_ = com.demo.domain.OperatingCompanyType.FEDEX_CUSTOM_CRITICAL;
            break;
            case FEDEX_EXPRESS: operatingCompanyType_ = com.demo.domain.OperatingCompanyType.FEDEX_EXPRESS;
            break;
            case FEDEX_FREIGHT: operatingCompanyType_ = com.demo.domain.OperatingCompanyType.FEDEX_FREIGHT;
            break;
            case FEDEX_GROUND: operatingCompanyType_ = com.demo.domain.OperatingCompanyType.FEDEX_GROUND;
            break;
            case FEDEX_KINKOS: operatingCompanyType_ = com.demo.domain.OperatingCompanyType.FEDEX_KINKOS;
            break;
            case FEDEX_OFFICE: operatingCompanyType_ = com.demo.domain.OperatingCompanyType.FEDEX_OFFICE;
            break;
            case FEDEX_SERVICES: operatingCompanyType_ = com.demo.domain.OperatingCompanyType.FEDEX_SERVICES;
            break;
            case FEDEX_TRADE_NETWORKS: operatingCompanyType_ = com.demo.domain.OperatingCompanyType.FEDEX_TRADE_NETWORKS;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return operatingCompanyType_;
    }
    @Override
    public com.demo.domain.ContactAndAddress map(ContactAndAddress value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.ContactAndAddress contactAndAddress_ = new com.demo.domain.ContactAndAddress();

        contactAndAddress_.setContact( map( value.getContact() ) );
        contactAndAddress_.setAddress( map( value.getAddress() ) );

        return contactAndAddress_;
    }

    @Override
    public List<com.demo.domain.TrackOtherIdentifierDetail> map6(List<TrackOtherIdentifierDetail> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.TrackOtherIdentifierDetail> list_ = new ArrayList<com.demo.domain.TrackOtherIdentifierDetail>();
        for ( TrackOtherIdentifierDetail trackOtherIdentifierDetail : value ) {
            list_.add( map( trackOtherIdentifierDetail ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.TrackOtherIdentifierDetail map(TrackOtherIdentifierDetail value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.TrackOtherIdentifierDetail trackOtherIdentifierDetail_ = new com.demo.domain.TrackOtherIdentifierDetail();

        trackOtherIdentifierDetail_.setPackageIdentifier( map( value.getPackageIdentifier() ) );
        trackOtherIdentifierDetail_.setTrackingNumberUniqueIdentifier( map( value.getTrackingNumberUniqueIdentifier() ) );
        trackOtherIdentifierDetail_.setCarrierCode( map( value.getCarrierCode() ) );

        return trackOtherIdentifierDetail_;
    }

    @Override
    public com.demo.domain.TrackServiceDescriptionDetail map(TrackServiceDescriptionDetail value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.TrackServiceDescriptionDetail trackServiceDescriptionDetail_ = new com.demo.domain.TrackServiceDescriptionDetail();

        trackServiceDescriptionDetail_.setType( map( value.getType() ) );
        trackServiceDescriptionDetail_.setDescription( map( value.getDescription() ) );
        trackServiceDescriptionDetail_.setShortDescription( map( value.getShortDescription() ) );

        return trackServiceDescriptionDetail_;
    }

    @Override
    public com.demo.domain.Weight map(Weight value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.Weight weight___ = new com.demo.domain.Weight();

        weight___.setUnits( map( value.getUnits() ) );
        weight___.setValue( value.getValue() );

        return weight___;
    }

    @Override
    public com.demo.domain.Dimensions map(Dimensions value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.Dimensions dimensions_ = new com.demo.domain.Dimensions();

        dimensions_.setLength( value.getLength() );
        dimensions_.setWidth( value.getWidth() );
        dimensions_.setHeight( value.getHeight() );
        dimensions_.setUnits( map( value.getUnits() ) );

        return dimensions_;
    }

    @Override
    public com.demo.domain.PackagingType map(PackagingType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.PackagingType packagingType_;

        switch ( value ) {
            case FEDEX_10_KG_BOX: packagingType_ = com.demo.domain.PackagingType.FEDEX_10_KG_BOX;
            break;
            case FEDEX_25_KG_BOX: packagingType_ = com.demo.domain.PackagingType.FEDEX_25_KG_BOX;
            break;
            case FEDEX_BOX: packagingType_ = com.demo.domain.PackagingType.FEDEX_BOX;
            break;
            case FEDEX_ENVELOPE: packagingType_ = com.demo.domain.PackagingType.FEDEX_ENVELOPE;
            break;
            case FEDEX_EXTRA_LARGE_BOX: packagingType_ = com.demo.domain.PackagingType.FEDEX_EXTRA_LARGE_BOX;
            break;
            case FEDEX_LARGE_BOX: packagingType_ = com.demo.domain.PackagingType.FEDEX_LARGE_BOX;
            break;
            case FEDEX_MEDIUM_BOX: packagingType_ = com.demo.domain.PackagingType.FEDEX_MEDIUM_BOX;
            break;
            case FEDEX_PAK: packagingType_ = com.demo.domain.PackagingType.FEDEX_PAK;
            break;
            case FEDEX_SMALL_BOX: packagingType_ = com.demo.domain.PackagingType.FEDEX_SMALL_BOX;
            break;
            case FEDEX_TUBE: packagingType_ = com.demo.domain.PackagingType.FEDEX_TUBE;
            break;
            case YOUR_PACKAGING: packagingType_ = com.demo.domain.PackagingType.YOUR_PACKAGING;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return packagingType_;
    }
    @Override
    public com.demo.domain.PhysicalPackagingType map(PhysicalPackagingType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.PhysicalPackagingType physicalPackagingType_;

        switch ( value ) {
            case BAG: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.BAG;
            break;
            case BARREL: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.BARREL;
            break;
            case BASKET: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.BASKET;
            break;
            case BOX: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.BOX;
            break;
            case BUCKET: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.BUCKET;
            break;
            case BUNDLE: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.BUNDLE;
            break;
            case CAGE: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.CAGE;
            break;
            case CARTON: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.CARTON;
            break;
            case CASE: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.CASE;
            break;
            case CHEST: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.CHEST;
            break;
            case CONTAINER: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.CONTAINER;
            break;
            case CRATE: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.CRATE;
            break;
            case CYLINDER: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.CYLINDER;
            break;
            case DRUM: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.DRUM;
            break;
            case ENVELOPE: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.ENVELOPE;
            break;
            case HAMPER: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.HAMPER;
            break;
            case OTHER: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.OTHER;
            break;
            case PACKAGE: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.PACKAGE;
            break;
            case PAIL: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.PAIL;
            break;
            case PALLET: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.PALLET;
            break;
            case PARCEL: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.PARCEL;
            break;
            case PIECE: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.PIECE;
            break;
            case REEL: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.REEL;
            break;
            case ROLL: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.ROLL;
            break;
            case SACK: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.SACK;
            break;
            case SHRINK_WRAPPED: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.SHRINK_WRAPPED;
            break;
            case SKID: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.SKID;
            break;
            case TANK: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.TANK;
            break;
            case TOTE_BIN: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.TOTE_BIN;
            break;
            case TUBE: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.TUBE;
            break;
            case UNIT: physicalPackagingType_ = com.demo.domain.PhysicalPackagingType.UNIT;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return physicalPackagingType_;
    }
    @Override
    public List<com.demo.domain.TrackChargeDetail> map7(List<TrackChargeDetail> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.TrackChargeDetail> list_ = new ArrayList<com.demo.domain.TrackChargeDetail>();
        for ( TrackChargeDetail trackChargeDetail : value ) {
            list_.add( map( trackChargeDetail ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.TrackChargeDetail map(TrackChargeDetail value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.TrackChargeDetail trackChargeDetail_ = new com.demo.domain.TrackChargeDetail();

        trackChargeDetail_.setType( map( value.getType() ) );
        trackChargeDetail_.setChargeAmount( map( value.getChargeAmount() ) );

        return trackChargeDetail_;
    }

    @Override
    public List<com.demo.domain.TrackDetailAttributeType> map8(List<TrackDetailAttributeType> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.TrackDetailAttributeType> list_ = new ArrayList<com.demo.domain.TrackDetailAttributeType>();
        for ( TrackDetailAttributeType trackDetailAttributeType : value ) {
            list_.add( map( trackDetailAttributeType ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.ContentRecord map(ContentRecord value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.ContentRecord contentRecord = new com.demo.domain.ContentRecord();

        contentRecord.setPartNumber( map( value.getPartNumber() ) );
        contentRecord.setItemNumber( map( value.getItemNumber() ) );
        contentRecord.setReceivedQuantity( value.getReceivedQuantity() );
        contentRecord.setDescription( map( value.getDescription() ) );

        return contentRecord;
    }

    @Override
    public List<com.demo.domain.ContentRecord> map9(List<ContentRecord> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.ContentRecord> list_ = new ArrayList<com.demo.domain.ContentRecord>();
        for ( ContentRecord contentRecord : value ) {
            list_.add( map( contentRecord ) );
        }

        return list_;
    }

    @Override
    public String map(String value) {
        if ( value == null ) {
            return null;
        }

        String string________________________________________ = new String();

        return string________________________________________;
    }

    @Override
    public List<String> map10(List<String> value) {
        if ( value == null ) {
            return null;
        }

        List<String> list_ = new ArrayList<String>();
        for ( String string : value ) {
            list_.add( map( string ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.TrackReturnDetail map(TrackReturnDetail value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.TrackReturnDetail trackReturnDetail_ = new com.demo.domain.TrackReturnDetail();

        trackReturnDetail_.setMovementStatus( map( value.getMovementStatus() ) );
        trackReturnDetail_.setLabelType( map( value.getLabelType() ) );
        trackReturnDetail_.setDescription( map( value.getDescription() ) );
        trackReturnDetail_.setAuthorizationName( map( value.getAuthorizationName() ) );

        return trackReturnDetail_;
    }

    @Override
    public com.demo.domain.Commodity map(Commodity value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.Commodity commodity = new com.demo.domain.Commodity();

        commodity.setCommodityId( map( value.getCommodityId() ) );
        commodity.setName( map( value.getName() ) );
        commodity.setNumberOfPieces( value.getNumberOfPieces() );
        commodity.setDescription( map( value.getDescription() ) );
        commodity.setPurpose( map( value.getPurpose() ) );
        commodity.setCountryOfManufacture( map( value.getCountryOfManufacture() ) );
        commodity.setHarmonizedCode( map( value.getHarmonizedCode() ) );
        commodity.setWeight( map( value.getWeight() ) );
        commodity.setQuantity( value.getQuantity() );
        commodity.setQuantityUnits( map( value.getQuantityUnits() ) );
        commodity.setUnitPrice( map( value.getUnitPrice() ) );
        commodity.setCustomsValue( map( value.getCustomsValue() ) );
        commodity.setExportLicenseNumber( map( value.getExportLicenseNumber() ) );
        commodity.setExportLicenseExpirationDate( value.getExportLicenseExpirationDate() );
        commodity.setCIMarksAndNumbers( map( value.getCIMarksAndNumbers() ) );
        commodity.setPartNumber( map( value.getPartNumber() ) );
        commodity.setNaftaDetail( map( value.getNaftaDetail() ) );
        if ( commodity.getAdditionalMeasures() != null ) {
            Collection<com.demo.domain.Measure> targetCollection = map27( value.getAdditionalMeasures() );
            if ( targetCollection != null ) {
                commodity.getAdditionalMeasures().addAll( targetCollection );
            }
        }
        if ( commodity.getExciseConditions() != null ) {
            Collection<com.demo.domain.EdtExciseCondition> targetCollection_ = map28( value.getExciseConditions() );
            if ( targetCollection_ != null ) {
                commodity.getExciseConditions().addAll( targetCollection_ );
            }
        }

        return commodity;
    }

    @Override
    public List<com.demo.domain.Commodity> map11(List<Commodity> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.Commodity> list_ = new ArrayList<com.demo.domain.Commodity>();
        for ( Commodity commodity : value ) {
            list_.add( map( commodity ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.CustomsOptionDetail map(CustomsOptionDetail value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.CustomsOptionDetail customsOptionDetail = new com.demo.domain.CustomsOptionDetail();

        customsOptionDetail.setType( map( value.getType() ) );
        customsOptionDetail.setDescription( map( value.getDescription() ) );

        return customsOptionDetail;
    }

    @Override
    public List<com.demo.domain.CustomsOptionDetail> map12(List<CustomsOptionDetail> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.CustomsOptionDetail> list_ = new ArrayList<com.demo.domain.CustomsOptionDetail>();
        for ( CustomsOptionDetail customsOptionDetail : value ) {
            list_.add( map( customsOptionDetail ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.TrackAdvanceNotificationDetail map(TrackAdvanceNotificationDetail value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.TrackAdvanceNotificationDetail trackAdvanceNotificationDetail_ = new com.demo.domain.TrackAdvanceNotificationDetail();

        trackAdvanceNotificationDetail_.setEstimatedTimeOfArrival( value.getEstimatedTimeOfArrival() );
        trackAdvanceNotificationDetail_.setReason( map( value.getReason() ) );
        trackAdvanceNotificationDetail_.setStatus( map( value.getStatus() ) );
        trackAdvanceNotificationDetail_.setStatusDescription( map( value.getStatusDescription() ) );
        trackAdvanceNotificationDetail_.setStatusTime( value.getStatusTime() );

        return trackAdvanceNotificationDetail_;
    }

    @Override
    public List<com.demo.domain.TrackSpecialHandling> map13(List<TrackSpecialHandling> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.TrackSpecialHandling> list_ = new ArrayList<com.demo.domain.TrackSpecialHandling>();
        for ( TrackSpecialHandling trackSpecialHandling : value ) {
            list_.add( map( trackSpecialHandling ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.TrackSpecialHandling map(TrackSpecialHandling value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.TrackSpecialHandling trackSpecialHandling_ = new com.demo.domain.TrackSpecialHandling();

        trackSpecialHandling_.setType( map( value.getType() ) );
        trackSpecialHandling_.setDescription( map( value.getDescription() ) );
        trackSpecialHandling_.setPaymentType( map( value.getPaymentType() ) );

        return trackSpecialHandling_;
    }

    @Override
    public List<com.demo.domain.TrackPayment> map14(List<TrackPayment> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.TrackPayment> list_ = new ArrayList<com.demo.domain.TrackPayment>();
        for ( TrackPayment trackPayment : value ) {
            list_.add( map( trackPayment ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.TrackPayment map(TrackPayment value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.TrackPayment trackPayment_ = new com.demo.domain.TrackPayment();

        trackPayment_.setClassification( map( value.getClassification() ) );
        trackPayment_.setType( map( value.getType() ) );
        trackPayment_.setDescription( map( value.getDescription() ) );

        return trackPayment_;
    }

    @Override
    public com.demo.domain.Contact map(Contact value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.Contact contact____ = new com.demo.domain.Contact();

        contact____.setPersonName( map( value.getPersonName() ) );
        contact____.setTitle( map( value.getTitle() ) );
        contact____.setCompanyName( map( value.getCompanyName() ) );
        contact____.setPhoneNumber( map( value.getPhoneNumber() ) );
        contact____.setPhoneExtension( map( value.getPhoneExtension() ) );
        contact____.setTollFreePhoneNumber( map( value.getTollFreePhoneNumber() ) );
        contact____.setPagerNumber( map( value.getPagerNumber() ) );
        contact____.setFaxNumber( map( value.getFaxNumber() ) );
        contact____.setEMailAddress( map( value.getEMailAddress() ) );

        return contact____;
    }

    @Override
    public com.demo.domain.TrackPossessionStatusType map(TrackPossessionStatusType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.TrackPossessionStatusType trackPossessionStatusType_;

        switch ( value ) {
            case BROKER: trackPossessionStatusType_ = com.demo.domain.TrackPossessionStatusType.BROKER;
            break;
            case CARRIER: trackPossessionStatusType_ = com.demo.domain.TrackPossessionStatusType.CARRIER;
            break;
            case CUSTOMS: trackPossessionStatusType_ = com.demo.domain.TrackPossessionStatusType.CUSTOMS;
            break;
            case RECIPIENT: trackPossessionStatusType_ = com.demo.domain.TrackPossessionStatusType.RECIPIENT;
            break;
            case SHIPPER: trackPossessionStatusType_ = com.demo.domain.TrackPossessionStatusType.SHIPPER;
            break;
            case SPLIT_STATUS: trackPossessionStatusType_ = com.demo.domain.TrackPossessionStatusType.SPLIT_STATUS;
            break;
            case TRANSFER_PARTNER: trackPossessionStatusType_ = com.demo.domain.TrackPossessionStatusType.TRANSFER_PARTNER;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return trackPossessionStatusType_;
    }
    @Override
    public com.demo.domain.Address map(Address value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.Address address_________ = new com.demo.domain.Address();

        address_________.setCity( map( value.getCity() ) );
        address_________.setStateOrProvinceCode( map( value.getStateOrProvinceCode() ) );
        address_________.setPostalCode( map( value.getPostalCode() ) );
        address_________.setUrbanizationCode( map( value.getUrbanizationCode() ) );
        address_________.setCountryCode( map( value.getCountryCode() ) );
        address_________.setCountryName( map( value.getCountryName() ) );
        address_________.setResidential( value.isResidential() );
        if ( address_________.getStreetLines() != null ) {
            Collection<String> targetCollection = map10( value.getStreetLines() );
            if ( targetCollection != null ) {
                address_________.getStreetLines().addAll( targetCollection );
            }
        }

        return address_________;
    }

    @Override
    public List<com.demo.domain.TrackingDateOrTimestamp> map15(List<TrackingDateOrTimestamp> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.TrackingDateOrTimestamp> list_ = new ArrayList<com.demo.domain.TrackingDateOrTimestamp>();
        for ( TrackingDateOrTimestamp trackingDateOrTimestamp : value ) {
            list_.add( map( trackingDateOrTimestamp ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.TrackingDateOrTimestamp map(TrackingDateOrTimestamp value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.TrackingDateOrTimestamp trackingDateOrTimestamp_ = new com.demo.domain.TrackingDateOrTimestamp();

        trackingDateOrTimestamp_.setType( map( value.getType() ) );
        trackingDateOrTimestamp_.setDateOrTimestamp( map( value.getDateOrTimestamp() ) );

        return trackingDateOrTimestamp_;
    }

    @Override
    public com.demo.domain.Distance map(Distance value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.Distance distance__ = new com.demo.domain.Distance();

        distance__.setValue( value.getValue() );
        distance__.setUnits( map( value.getUnits() ) );

        return distance__;
    }

    @Override
    public List<com.demo.domain.TrackSpecialInstruction> map16(List<TrackSpecialInstruction> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.TrackSpecialInstruction> list_ = new ArrayList<com.demo.domain.TrackSpecialInstruction>();
        for ( TrackSpecialInstruction trackSpecialInstruction : value ) {
            list_.add( map( trackSpecialInstruction ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.TrackSpecialInstruction map(TrackSpecialInstruction value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.TrackSpecialInstruction trackSpecialInstruction_ = new com.demo.domain.TrackSpecialInstruction();

        trackSpecialInstruction_.setDescription( map( value.getDescription() ) );
        trackSpecialInstruction_.setDeliveryOption( map( value.getDeliveryOption() ) );
        trackSpecialInstruction_.setStatusDetail( map( value.getStatusDetail() ) );
        trackSpecialInstruction_.setOriginalEstimatedDeliveryTimestamp( value.getOriginalEstimatedDeliveryTimestamp() );
        trackSpecialInstruction_.setOriginalRequestTime( value.getOriginalRequestTime() );
        trackSpecialInstruction_.setRequestedAppointmentTime( map( value.getRequestedAppointmentTime() ) );

        return trackSpecialInstruction_;
    }

    @Override
    public com.demo.domain.FedExLocationType map(FedExLocationType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.FedExLocationType fedExLocationType_;

        switch ( value ) {
            case FEDEX_AUTHORIZED_SHIP_CENTER: fedExLocationType_ = com.demo.domain.FedExLocationType.FEDEX_AUTHORIZED_SHIP_CENTER;
            break;
            case FEDEX_EXPRESS_STATION: fedExLocationType_ = com.demo.domain.FedExLocationType.FEDEX_EXPRESS_STATION;
            break;
            case FEDEX_FACILITY: fedExLocationType_ = com.demo.domain.FedExLocationType.FEDEX_FACILITY;
            break;
            case FEDEX_FREIGHT_SERVICE_CENTER: fedExLocationType_ = com.demo.domain.FedExLocationType.FEDEX_FREIGHT_SERVICE_CENTER;
            break;
            case FEDEX_GROUND_TERMINAL: fedExLocationType_ = com.demo.domain.FedExLocationType.FEDEX_GROUND_TERMINAL;
            break;
            case FEDEX_HOME_DELIVERY_STATION: fedExLocationType_ = com.demo.domain.FedExLocationType.FEDEX_HOME_DELIVERY_STATION;
            break;
            case FEDEX_OFFICE: fedExLocationType_ = com.demo.domain.FedExLocationType.FEDEX_OFFICE;
            break;
            case FEDEX_SELF_SERVICE_LOCATION: fedExLocationType_ = com.demo.domain.FedExLocationType.FEDEX_SELF_SERVICE_LOCATION;
            break;
            case FEDEX_SHIPSITE: fedExLocationType_ = com.demo.domain.FedExLocationType.FEDEX_SHIPSITE;
            break;
            case FEDEX_SMART_POST_HUB: fedExLocationType_ = com.demo.domain.FedExLocationType.FEDEX_SMART_POST_HUB;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return fedExLocationType_;
    }
    @Override
    public com.demo.domain.OfficeOrderDeliveryMethodType map(OfficeOrderDeliveryMethodType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.OfficeOrderDeliveryMethodType officeOrderDeliveryMethodType_;

        switch ( value ) {
            case COURIER: officeOrderDeliveryMethodType_ = com.demo.domain.OfficeOrderDeliveryMethodType.COURIER;
            break;
            case OTHER: officeOrderDeliveryMethodType_ = com.demo.domain.OfficeOrderDeliveryMethodType.OTHER;
            break;
            case PICKUP: officeOrderDeliveryMethodType_ = com.demo.domain.OfficeOrderDeliveryMethodType.PICKUP;
            break;
            case SHIPMENT: officeOrderDeliveryMethodType_ = com.demo.domain.OfficeOrderDeliveryMethodType.SHIPMENT;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return officeOrderDeliveryMethodType_;
    }
    @Override
    public com.demo.domain.TrackDeliveryLocationType map(TrackDeliveryLocationType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.TrackDeliveryLocationType trackDeliveryLocationType_;

        switch ( value ) {
            case APARTMENT_OFFICE: trackDeliveryLocationType_ = com.demo.domain.TrackDeliveryLocationType.APARTMENT_OFFICE;
            break;
            case FEDEX_LOCATION: trackDeliveryLocationType_ = com.demo.domain.TrackDeliveryLocationType.FEDEX_LOCATION;
            break;
            case GATE_HOUSE: trackDeliveryLocationType_ = com.demo.domain.TrackDeliveryLocationType.GATE_HOUSE;
            break;
            case GUARD_OR_SECURITY_STATION: trackDeliveryLocationType_ = com.demo.domain.TrackDeliveryLocationType.GUARD_OR_SECURITY_STATION;
            break;
            case IN_BOND_OR_CAGE: trackDeliveryLocationType_ = com.demo.domain.TrackDeliveryLocationType.IN_BOND_OR_CAGE;
            break;
            case LEASING_OFFICE: trackDeliveryLocationType_ = com.demo.domain.TrackDeliveryLocationType.LEASING_OFFICE;
            break;
            case MAILROOM: trackDeliveryLocationType_ = com.demo.domain.TrackDeliveryLocationType.MAILROOM;
            break;
            case MAIN_OFFICE: trackDeliveryLocationType_ = com.demo.domain.TrackDeliveryLocationType.MAIN_OFFICE;
            break;
            case MANAGER_OFFICE: trackDeliveryLocationType_ = com.demo.domain.TrackDeliveryLocationType.MANAGER_OFFICE;
            break;
            case OTHER: trackDeliveryLocationType_ = com.demo.domain.TrackDeliveryLocationType.OTHER;
            break;
            case PHARMACY: trackDeliveryLocationType_ = com.demo.domain.TrackDeliveryLocationType.PHARMACY;
            break;
            case RECEPTIONIST_OR_FRONT_DESK: trackDeliveryLocationType_ = com.demo.domain.TrackDeliveryLocationType.RECEPTIONIST_OR_FRONT_DESK;
            break;
            case RENTAL_OFFICE: trackDeliveryLocationType_ = com.demo.domain.TrackDeliveryLocationType.RENTAL_OFFICE;
            break;
            case RESIDENCE: trackDeliveryLocationType_ = com.demo.domain.TrackDeliveryLocationType.RESIDENCE;
            break;
            case SHIPPING_RECEIVING: trackDeliveryLocationType_ = com.demo.domain.TrackDeliveryLocationType.SHIPPING_RECEIVING;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return trackDeliveryLocationType_;
    }
    @Override
    public List<com.demo.domain.PieceCountVerificationDetail> map17(List<PieceCountVerificationDetail> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.PieceCountVerificationDetail> list_ = new ArrayList<com.demo.domain.PieceCountVerificationDetail>();
        for ( PieceCountVerificationDetail pieceCountVerificationDetail : value ) {
            list_.add( map( pieceCountVerificationDetail ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.PieceCountVerificationDetail map(PieceCountVerificationDetail value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.PieceCountVerificationDetail pieceCountVerificationDetail_ = new com.demo.domain.PieceCountVerificationDetail();

        pieceCountVerificationDetail_.setCountLocationType( map( value.getCountLocationType() ) );
        pieceCountVerificationDetail_.setCount( value.getCount() );
        pieceCountVerificationDetail_.setDescription( map( value.getDescription() ) );

        return pieceCountVerificationDetail_;
    }

    @Override
    public List<com.demo.domain.AvailableImagesDetail> map18(List<AvailableImagesDetail> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.AvailableImagesDetail> list_ = new ArrayList<com.demo.domain.AvailableImagesDetail>();
        for ( AvailableImagesDetail availableImagesDetail : value ) {
            list_.add( map( availableImagesDetail ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.AvailableImagesDetail map(AvailableImagesDetail value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.AvailableImagesDetail availableImagesDetail_ = new com.demo.domain.AvailableImagesDetail();

        availableImagesDetail_.setType( map( value.getType() ) );
        availableImagesDetail_.setSize( map( value.getSize() ) );

        return availableImagesDetail_;
    }

    @Override
    public com.demo.domain.SignatureImageDetail map(SignatureImageDetail value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.SignatureImageDetail signatureImageDetail_ = new com.demo.domain.SignatureImageDetail();

        if ( value.getImage() != null ) {
            byte[] image = value.getImage();
            signatureImageDetail_.setImage( Arrays.copyOf( image, image.length ) );
        }
        if ( signatureImageDetail_.getNotifications() != null ) {
            Collection<com.demo.domain.Notification> targetCollection = map( value.getNotifications() );
            if ( targetCollection != null ) {
                signatureImageDetail_.getNotifications().addAll( targetCollection );
            }
        }

        return signatureImageDetail_;
    }

    @Override
    public com.demo.domain.NotificationEventType map(NotificationEventType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.NotificationEventType notificationEventType;

        switch ( value ) {
            case ON_DELIVERY: notificationEventType = com.demo.domain.NotificationEventType.ON_DELIVERY;
            break;
            case ON_ESTIMATED_DELIVERY: notificationEventType = com.demo.domain.NotificationEventType.ON_ESTIMATED_DELIVERY;
            break;
            case ON_EXCEPTION: notificationEventType = com.demo.domain.NotificationEventType.ON_EXCEPTION;
            break;
            case ON_SHIPMENT: notificationEventType = com.demo.domain.NotificationEventType.ON_SHIPMENT;
            break;
            case ON_TENDER: notificationEventType = com.demo.domain.NotificationEventType.ON_TENDER;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return notificationEventType;
    }
    @Override
    public List<com.demo.domain.TrackSplitShipmentPart> map20(List<TrackSplitShipmentPart> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.TrackSplitShipmentPart> list_ = new ArrayList<com.demo.domain.TrackSplitShipmentPart>();
        for ( TrackSplitShipmentPart trackSplitShipmentPart : value ) {
            list_.add( map( trackSplitShipmentPart ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.TrackSplitShipmentPart map(TrackSplitShipmentPart value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.TrackSplitShipmentPart trackSplitShipmentPart_ = new com.demo.domain.TrackSplitShipmentPart();

        trackSplitShipmentPart_.setPieceCount( value.getPieceCount() );
        trackSplitShipmentPart_.setTimestamp( value.getTimestamp() );
        trackSplitShipmentPart_.setStatusCode( map( value.getStatusCode() ) );
        trackSplitShipmentPart_.setStatusDescription( map( value.getStatusDescription() ) );

        return trackSplitShipmentPart_;
    }

    @Override
    public List<com.demo.domain.NotificationEventType> map19(List<NotificationEventType> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.NotificationEventType> list = new ArrayList<com.demo.domain.NotificationEventType>();
        for ( NotificationEventType notificationEventType : value ) {
            list.add( map( notificationEventType ) );
        }

        return list;
    }

    @Override
    public com.demo.domain.DeliveryOptionEligibilityDetail map(DeliveryOptionEligibilityDetail value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.DeliveryOptionEligibilityDetail deliveryOptionEligibilityDetail = new com.demo.domain.DeliveryOptionEligibilityDetail();

        deliveryOptionEligibilityDetail.setOption( map( value.getOption() ) );
        deliveryOptionEligibilityDetail.setEligibility( map( value.getEligibility() ) );

        return deliveryOptionEligibilityDetail;
    }

    @Override
    public List<com.demo.domain.DeliveryOptionEligibilityDetail> map21(List<DeliveryOptionEligibilityDetail> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.DeliveryOptionEligibilityDetail> list_ = new ArrayList<com.demo.domain.DeliveryOptionEligibilityDetail>();
        for ( DeliveryOptionEligibilityDetail deliveryOptionEligibilityDetail : value ) {
            list_.add( map( deliveryOptionEligibilityDetail ) );
        }

        return list_;
    }

    @Override
    public List<com.demo.domain.TrackEvent> map22(List<TrackEvent> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.TrackEvent> list_ = new ArrayList<com.demo.domain.TrackEvent>();
        for ( TrackEvent trackEvent : value ) {
            list_.add( map( trackEvent ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.TrackEvent map(TrackEvent value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.TrackEvent trackEvent_ = new com.demo.domain.TrackEvent();

        trackEvent_.setTimestamp( value.getTimestamp() );
        trackEvent_.setEventType( map( value.getEventType() ) );
        trackEvent_.setEventDescription( map( value.getEventDescription() ) );
        trackEvent_.setStatusExceptionCode( map( value.getStatusExceptionCode() ) );
        trackEvent_.setStatusExceptionDescription( map( value.getStatusExceptionDescription() ) );
        trackEvent_.setAddress( map( value.getAddress() ) );
        trackEvent_.setStationId( map( value.getStationId() ) );
        trackEvent_.setArrivalLocation( map( value.getArrivalLocation() ) );

        return trackEvent_;
    }

    @Override
    public List<com.demo.domain.NotificationParameter> map23(List<NotificationParameter> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.NotificationParameter> list_ = new ArrayList<com.demo.domain.NotificationParameter>();
        for ( NotificationParameter notificationParameter : value ) {
            list_.add( map( notificationParameter ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.Localization map(Localization value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.Localization localization_ = new com.demo.domain.Localization();

        localization_.setLanguageCode( map( value.getLanguageCode() ) );
        localization_.setLocaleCode( map( value.getLocaleCode() ) );

        return localization_;
    }

    @Override
    public com.demo.domain.StringBarcode map(StringBarcode value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.StringBarcode stringBarcode_ = new com.demo.domain.StringBarcode();

        stringBarcode_.setType( map( value.getType() ) );
        stringBarcode_.setValue( map( value.getValue() ) );

        return stringBarcode_;
    }

    @Override
    public List<com.demo.domain.TrackStatusAncillaryDetail> map24(List<TrackStatusAncillaryDetail> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.TrackStatusAncillaryDetail> list_ = new ArrayList<com.demo.domain.TrackStatusAncillaryDetail>();
        for ( TrackStatusAncillaryDetail trackStatusAncillaryDetail : value ) {
            list_.add( map( trackStatusAncillaryDetail ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.TrackPackageIdentifier map(TrackPackageIdentifier value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.TrackPackageIdentifier trackPackageIdentifier_ = new com.demo.domain.TrackPackageIdentifier();

        trackPackageIdentifier_.setType( map( value.getType() ) );
        trackPackageIdentifier_.setValue( map( value.getValue() ) );

        return trackPackageIdentifier_;
    }

    @Override
    public com.demo.domain.ServiceType map(ServiceType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.ServiceType serviceType_;

        switch ( value ) {
            case EUROPE_FIRST_INTERNATIONAL_PRIORITY: serviceType_ = com.demo.domain.ServiceType.EUROPE_FIRST_INTERNATIONAL_PRIORITY;
            break;
            case FEDEX_1_DAY_FREIGHT: serviceType_ = com.demo.domain.ServiceType.FEDEX_1_DAY_FREIGHT;
            break;
            case FEDEX_2_DAY: serviceType_ = com.demo.domain.ServiceType.FEDEX_2_DAY;
            break;
            case FEDEX_2_DAY_AM: serviceType_ = com.demo.domain.ServiceType.FEDEX_2_DAY_AM;
            break;
            case FEDEX_2_DAY_FREIGHT: serviceType_ = com.demo.domain.ServiceType.FEDEX_2_DAY_FREIGHT;
            break;
            case FEDEX_3_DAY_FREIGHT: serviceType_ = com.demo.domain.ServiceType.FEDEX_3_DAY_FREIGHT;
            break;
            case FEDEX_CARGO_AIRPORT_TO_AIRPORT: serviceType_ = com.demo.domain.ServiceType.FEDEX_CARGO_AIRPORT_TO_AIRPORT;
            break;
            case FEDEX_CARGO_FREIGHT_FORWARDING: serviceType_ = com.demo.domain.ServiceType.FEDEX_CARGO_FREIGHT_FORWARDING;
            break;
            case FEDEX_CARGO_INTERNATIONAL_EXPRESS_FREIGHT: serviceType_ = com.demo.domain.ServiceType.FEDEX_CARGO_INTERNATIONAL_EXPRESS_FREIGHT;
            break;
            case FEDEX_CARGO_INTERNATIONAL_PREMIUM: serviceType_ = com.demo.domain.ServiceType.FEDEX_CARGO_INTERNATIONAL_PREMIUM;
            break;
            case FEDEX_CARGO_MAIL: serviceType_ = com.demo.domain.ServiceType.FEDEX_CARGO_MAIL;
            break;
            case FEDEX_CARGO_REGISTERED_MAIL: serviceType_ = com.demo.domain.ServiceType.FEDEX_CARGO_REGISTERED_MAIL;
            break;
            case FEDEX_CARGO_SURFACE_MAIL: serviceType_ = com.demo.domain.ServiceType.FEDEX_CARGO_SURFACE_MAIL;
            break;
            case FEDEX_CUSTOM_CRITICAL_AIR_EXPEDITE: serviceType_ = com.demo.domain.ServiceType.FEDEX_CUSTOM_CRITICAL_AIR_EXPEDITE;
            break;
            case FEDEX_CUSTOM_CRITICAL_AIR_EXPEDITE_EXCLUSIVE_USE: serviceType_ = com.demo.domain.ServiceType.FEDEX_CUSTOM_CRITICAL_AIR_EXPEDITE_EXCLUSIVE_USE;
            break;
            case FEDEX_CUSTOM_CRITICAL_AIR_EXPEDITE_NETWORK: serviceType_ = com.demo.domain.ServiceType.FEDEX_CUSTOM_CRITICAL_AIR_EXPEDITE_NETWORK;
            break;
            case FEDEX_CUSTOM_CRITICAL_CHARTER_AIR: serviceType_ = com.demo.domain.ServiceType.FEDEX_CUSTOM_CRITICAL_CHARTER_AIR;
            break;
            case FEDEX_CUSTOM_CRITICAL_POINT_TO_POINT: serviceType_ = com.demo.domain.ServiceType.FEDEX_CUSTOM_CRITICAL_POINT_TO_POINT;
            break;
            case FEDEX_CUSTOM_CRITICAL_SURFACE_EXPEDITE: serviceType_ = com.demo.domain.ServiceType.FEDEX_CUSTOM_CRITICAL_SURFACE_EXPEDITE;
            break;
            case FEDEX_CUSTOM_CRITICAL_SURFACE_EXPEDITE_EXCLUSIVE_USE: serviceType_ = com.demo.domain.ServiceType.FEDEX_CUSTOM_CRITICAL_SURFACE_EXPEDITE_EXCLUSIVE_USE;
            break;
            case FEDEX_CUSTOM_CRITICAL_TEMP_ASSURE_AIR: serviceType_ = com.demo.domain.ServiceType.FEDEX_CUSTOM_CRITICAL_TEMP_ASSURE_AIR;
            break;
            case FEDEX_CUSTOM_CRITICAL_TEMP_ASSURE_VALIDATED_AIR: serviceType_ = com.demo.domain.ServiceType.FEDEX_CUSTOM_CRITICAL_TEMP_ASSURE_VALIDATED_AIR;
            break;
            case FEDEX_CUSTOM_CRITICAL_WHITE_GLOVE_SERVICES: serviceType_ = com.demo.domain.ServiceType.FEDEX_CUSTOM_CRITICAL_WHITE_GLOVE_SERVICES;
            break;
            case FEDEX_DISTANCE_DEFERRED: serviceType_ = com.demo.domain.ServiceType.FEDEX_DISTANCE_DEFERRED;
            break;
            case FEDEX_EXPRESS_SAVER: serviceType_ = com.demo.domain.ServiceType.FEDEX_EXPRESS_SAVER;
            break;
            case FEDEX_FIRST_FREIGHT: serviceType_ = com.demo.domain.ServiceType.FEDEX_FIRST_FREIGHT;
            break;
            case FEDEX_FREIGHT_ECONOMY: serviceType_ = com.demo.domain.ServiceType.FEDEX_FREIGHT_ECONOMY;
            break;
            case FEDEX_FREIGHT_PRIORITY: serviceType_ = com.demo.domain.ServiceType.FEDEX_FREIGHT_PRIORITY;
            break;
            case FEDEX_GROUND: serviceType_ = com.demo.domain.ServiceType.FEDEX_GROUND;
            break;
            case FEDEX_NEXT_DAY_AFTERNOON: serviceType_ = com.demo.domain.ServiceType.FEDEX_NEXT_DAY_AFTERNOON;
            break;
            case FEDEX_NEXT_DAY_EARLY_MORNING: serviceType_ = com.demo.domain.ServiceType.FEDEX_NEXT_DAY_EARLY_MORNING;
            break;
            case FEDEX_NEXT_DAY_END_OF_DAY: serviceType_ = com.demo.domain.ServiceType.FEDEX_NEXT_DAY_END_OF_DAY;
            break;
            case FEDEX_NEXT_DAY_FREIGHT: serviceType_ = com.demo.domain.ServiceType.FEDEX_NEXT_DAY_FREIGHT;
            break;
            case FEDEX_NEXT_DAY_MID_MORNING: serviceType_ = com.demo.domain.ServiceType.FEDEX_NEXT_DAY_MID_MORNING;
            break;
            case FIRST_OVERNIGHT: serviceType_ = com.demo.domain.ServiceType.FIRST_OVERNIGHT;
            break;
            case GROUND_HOME_DELIVERY: serviceType_ = com.demo.domain.ServiceType.GROUND_HOME_DELIVERY;
            break;
            case INTERNATIONAL_DISTRIBUTION_FREIGHT: serviceType_ = com.demo.domain.ServiceType.INTERNATIONAL_DISTRIBUTION_FREIGHT;
            break;
            case INTERNATIONAL_ECONOMY: serviceType_ = com.demo.domain.ServiceType.INTERNATIONAL_ECONOMY;
            break;
            case INTERNATIONAL_ECONOMY_DISTRIBUTION: serviceType_ = com.demo.domain.ServiceType.INTERNATIONAL_ECONOMY_DISTRIBUTION;
            break;
            case INTERNATIONAL_ECONOMY_FREIGHT: serviceType_ = com.demo.domain.ServiceType.INTERNATIONAL_ECONOMY_FREIGHT;
            break;
            case INTERNATIONAL_FIRST: serviceType_ = com.demo.domain.ServiceType.INTERNATIONAL_FIRST;
            break;
            case INTERNATIONAL_PRIORITY: serviceType_ = com.demo.domain.ServiceType.INTERNATIONAL_PRIORITY;
            break;
            case INTERNATIONAL_PRIORITY_DISTRIBUTION: serviceType_ = com.demo.domain.ServiceType.INTERNATIONAL_PRIORITY_DISTRIBUTION;
            break;
            case INTERNATIONAL_PRIORITY_FREIGHT: serviceType_ = com.demo.domain.ServiceType.INTERNATIONAL_PRIORITY_FREIGHT;
            break;
            case PRIORITY_OVERNIGHT: serviceType_ = com.demo.domain.ServiceType.PRIORITY_OVERNIGHT;
            break;
            case SAME_DAY: serviceType_ = com.demo.domain.ServiceType.SAME_DAY;
            break;
            case SAME_DAY_CITY: serviceType_ = com.demo.domain.ServiceType.SAME_DAY_CITY;
            break;
            case SMART_POST: serviceType_ = com.demo.domain.ServiceType.SMART_POST;
            break;
            case STANDARD_OVERNIGHT: serviceType_ = com.demo.domain.ServiceType.STANDARD_OVERNIGHT;
            break;
            case TRANSBORDER_DISTRIBUTION_CONSOLIDATION: serviceType_ = com.demo.domain.ServiceType.TRANSBORDER_DISTRIBUTION_CONSOLIDATION;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return serviceType_;
    }
    @Override
    public com.demo.domain.WeightUnits map(WeightUnits value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.WeightUnits weightUnits_;

        switch ( value ) {
            case KG: weightUnits_ = com.demo.domain.WeightUnits.KG;
            break;
            case LB: weightUnits_ = com.demo.domain.WeightUnits.LB;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return weightUnits_;
    }
    @Override
    public com.demo.domain.LinearUnits map(LinearUnits value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.LinearUnits linearUnits_;

        switch ( value ) {
            case CM: linearUnits_ = com.demo.domain.LinearUnits.CM;
            break;
            case IN: linearUnits_ = com.demo.domain.LinearUnits.IN;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return linearUnits_;
    }
    @Override
    public com.demo.domain.TrackChargeDetailType map(TrackChargeDetailType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.TrackChargeDetailType trackChargeDetailType_;

        switch ( value ) {
            case ORIGINAL_CHARGES: trackChargeDetailType_ = com.demo.domain.TrackChargeDetailType.ORIGINAL_CHARGES;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return trackChargeDetailType_;
    }
    @Override
    public com.demo.domain.TrackDetailAttributeType map(TrackDetailAttributeType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.TrackDetailAttributeType trackDetailAttributeType_;

        switch ( value ) {
            case INCLUDED_IN_WATCHLIST: trackDetailAttributeType_ = com.demo.domain.TrackDetailAttributeType.INCLUDED_IN_WATCHLIST;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return trackDetailAttributeType_;
    }
    @Override
    public com.demo.domain.TrackReturnMovementStatusType map(TrackReturnMovementStatusType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.TrackReturnMovementStatusType trackReturnMovementStatusType_;

        switch ( value ) {
            case MOVEMENT_OCCURRED: trackReturnMovementStatusType_ = com.demo.domain.TrackReturnMovementStatusType.MOVEMENT_OCCURRED;
            break;
            case NO_MOVEMENT: trackReturnMovementStatusType_ = com.demo.domain.TrackReturnMovementStatusType.NO_MOVEMENT;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return trackReturnMovementStatusType_;
    }
    @Override
    public com.demo.domain.CommodityPurposeType map(CommodityPurposeType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.CommodityPurposeType commodityPurposeType_;

        switch ( value ) {
            case BUSINESS: commodityPurposeType_ = com.demo.domain.CommodityPurposeType.BUSINESS;
            break;
            case CONSUMER: commodityPurposeType_ = com.demo.domain.CommodityPurposeType.CONSUMER;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return commodityPurposeType_;
    }
    @Override
    public com.demo.domain.CustomsOptionType map(CustomsOptionType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.CustomsOptionType customsOptionType_;

        switch ( value ) {
            case COURTESY_RETURN_LABEL: customsOptionType_ = com.demo.domain.CustomsOptionType.COURTESY_RETURN_LABEL;
            break;
            case EXHIBITION_TRADE_SHOW: customsOptionType_ = com.demo.domain.CustomsOptionType.EXHIBITION_TRADE_SHOW;
            break;
            case FAULTY_ITEM: customsOptionType_ = com.demo.domain.CustomsOptionType.FAULTY_ITEM;
            break;
            case FOLLOWING_REPAIR: customsOptionType_ = com.demo.domain.CustomsOptionType.FOLLOWING_REPAIR;
            break;
            case FOR_REPAIR: customsOptionType_ = com.demo.domain.CustomsOptionType.FOR_REPAIR;
            break;
            case ITEM_FOR_LOAN: customsOptionType_ = com.demo.domain.CustomsOptionType.ITEM_FOR_LOAN;
            break;
            case OTHER: customsOptionType_ = com.demo.domain.CustomsOptionType.OTHER;
            break;
            case REJECTED: customsOptionType_ = com.demo.domain.CustomsOptionType.REJECTED;
            break;
            case REPLACEMENT: customsOptionType_ = com.demo.domain.CustomsOptionType.REPLACEMENT;
            break;
            case TRIAL: customsOptionType_ = com.demo.domain.CustomsOptionType.TRIAL;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return customsOptionType_;
    }
    @Override
    public com.demo.domain.TrackAdvanceNotificationStatusType map(TrackAdvanceNotificationStatusType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.TrackAdvanceNotificationStatusType trackAdvanceNotificationStatusType_;

        switch ( value ) {
            case BACK_ON_TRACK: trackAdvanceNotificationStatusType_ = com.demo.domain.TrackAdvanceNotificationStatusType.BACK_ON_TRACK;
            break;
            case FAIL: trackAdvanceNotificationStatusType_ = com.demo.domain.TrackAdvanceNotificationStatusType.FAIL;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return trackAdvanceNotificationStatusType_;
    }
    @Override
    public com.demo.domain.TrackSpecialHandlingType map(TrackSpecialHandlingType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.TrackSpecialHandlingType trackSpecialHandlingType_;

        switch ( value ) {
            case ACCESSIBLE_DANGEROUS_GOODS: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.ACCESSIBLE_DANGEROUS_GOODS;
            break;
            case ADULT_SIGNATURE_OPTION: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.ADULT_SIGNATURE_OPTION;
            break;
            case AIRBILL_AUTOMATION: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.AIRBILL_AUTOMATION;
            break;
            case AIRBILL_DELIVERY: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.AIRBILL_DELIVERY;
            break;
            case ALCOHOL: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.ALCOHOL;
            break;
            case AM_DELIVERY_GUARANTEE: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.AM_DELIVERY_GUARANTEE;
            break;
            case APPOINTMENT_DELIVERY: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.APPOINTMENT_DELIVERY;
            break;
            case BILL_RECIPIENT: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.BILL_RECIPIENT;
            break;
            case BROKER_SELECT_OPTION: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.BROKER_SELECT_OPTION;
            break;
            case CALL_BEFORE_DELIVERY: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.CALL_BEFORE_DELIVERY;
            break;
            case CALL_TAG: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.CALL_TAG;
            break;
            case CALL_TAG_DAMAGE: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.CALL_TAG_DAMAGE;
            break;
            case CHARGEABLE_CODE: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.CHARGEABLE_CODE;
            break;
            case COD: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.COD;
            break;
            case COLLECT: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.COLLECT;
            break;
            case CONSOLIDATION: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.CONSOLIDATION;
            break;
            case CONSOLIDATION_SMALLS_BAG: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.CONSOLIDATION_SMALLS_BAG;
            break;
            case CURRENCY: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.CURRENCY;
            break;
            case CUT_FLOWERS: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.CUT_FLOWERS;
            break;
            case DATE_CERTAIN_DELIVERY: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.DATE_CERTAIN_DELIVERY;
            break;
            case DELIVERY_ON_INVOICE_ACCEPTANCE: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.DELIVERY_ON_INVOICE_ACCEPTANCE;
            break;
            case DELIVERY_REATTEMPT: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.DELIVERY_REATTEMPT;
            break;
            case DELIVERY_RECEIPT: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.DELIVERY_RECEIPT;
            break;
            case DELIVER_WEEKDAY: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.DELIVER_WEEKDAY;
            break;
            case DIRECT_SIGNATURE_OPTION: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.DIRECT_SIGNATURE_OPTION;
            break;
            case DOMESTIC: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.DOMESTIC;
            break;
            case DO_NOT_BREAK_DOWN_PALLETS: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.DO_NOT_BREAK_DOWN_PALLETS;
            break;
            case DO_NOT_STACK_PALLETS: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.DO_NOT_STACK_PALLETS;
            break;
            case DRY_ICE: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.DRY_ICE;
            break;
            case DRY_ICE_ADDED: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.DRY_ICE_ADDED;
            break;
            case EAST_COAST_SPECIAL: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.EAST_COAST_SPECIAL;
            break;
            case ELECTRONIC_COD: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.ELECTRONIC_COD;
            break;
            case ELECTRONIC_SIGNATURE_SERVICE: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.ELECTRONIC_SIGNATURE_SERVICE;
            break;
            case EVENING_DELIVERY: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.EVENING_DELIVERY;
            break;
            case EXCLUSIVE_USE: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.EXCLUSIVE_USE;
            break;
            case EXTENDED_DELIVERY: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.EXTENDED_DELIVERY;
            break;
            case EXTENDED_PICKUP: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.EXTENDED_PICKUP;
            break;
            case EXTRA_LABOR: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.EXTRA_LABOR;
            break;
            case EXTREME_LENGTH: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.EXTREME_LENGTH;
            break;
            case FOOD: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.FOOD;
            break;
            case FREIGHT_ON_VALUE_CARRIER_RISK: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.FREIGHT_ON_VALUE_CARRIER_RISK;
            break;
            case FREIGHT_ON_VALUE_OWN_RISK: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.FREIGHT_ON_VALUE_OWN_RISK;
            break;
            case FREIGHT_TO_COLLECT: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.FREIGHT_TO_COLLECT;
            break;
            case FULLY_REGULATED_DANGEROUS_GOODS: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.FULLY_REGULATED_DANGEROUS_GOODS;
            break;
            case GEL_PACKS_ADDED_OR_REPLACED: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.GEL_PACKS_ADDED_OR_REPLACED;
            break;
            case GROUND_SUPPORT_FOR_SMARTPOST: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.GROUND_SUPPORT_FOR_SMARTPOST;
            break;
            case GUARANTEED_FUNDS: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.GUARANTEED_FUNDS;
            break;
            case HAZMAT: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.HAZMAT;
            break;
            case HIGH_FLOOR: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.HIGH_FLOOR;
            break;
            case HOLD_AT_LOCATION: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.HOLD_AT_LOCATION;
            break;
            case HOLIDAY_DELIVERY: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.HOLIDAY_DELIVERY;
            break;
            case INACCESSIBLE_DANGEROUS_GOODS: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.INACCESSIBLE_DANGEROUS_GOODS;
            break;
            case INDIRECT_SIGNATURE_OPTION: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.INDIRECT_SIGNATURE_OPTION;
            break;
            case INSIDE_DELIVERY: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.INSIDE_DELIVERY;
            break;
            case INSIDE_PICKUP: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.INSIDE_PICKUP;
            break;
            case INTERNATIONAL: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.INTERNATIONAL;
            break;
            case INTERNATIONAL_CONTROLLED_EXPORT: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.INTERNATIONAL_CONTROLLED_EXPORT;
            break;
            case INTERNATIONAL_MAIL_SERVICE: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.INTERNATIONAL_MAIL_SERVICE;
            break;
            case INTERNATIONAL_TRAFFIC_IN_ARMS_REGULATIONS: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.INTERNATIONAL_TRAFFIC_IN_ARMS_REGULATIONS;
            break;
            case LIFTGATE: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.LIFTGATE;
            break;
            case LIFTGATE_DELIVERY: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.LIFTGATE_DELIVERY;
            break;
            case LIFTGATE_PICKUP: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.LIFTGATE_PICKUP;
            break;
            case LIMITED_ACCESS_DELIVERY: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.LIMITED_ACCESS_DELIVERY;
            break;
            case LIMITED_ACCESS_PICKUP: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.LIMITED_ACCESS_PICKUP;
            break;
            case LIMITED_QUANTITIES_DANGEROUS_GOODS: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.LIMITED_QUANTITIES_DANGEROUS_GOODS;
            break;
            case MARKING_OR_TAGGING: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.MARKING_OR_TAGGING;
            break;
            case NET_RETURN: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.NET_RETURN;
            break;
            case NON_BUSINESS_TIME: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.NON_BUSINESS_TIME;
            break;
            case NON_STANDARD_CONTAINER: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.NON_STANDARD_CONTAINER;
            break;
            case NO_SIGNATURE_REQUIRED_SIGNATURE_OPTION: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.NO_SIGNATURE_REQUIRED_SIGNATURE_OPTION;
            break;
            case ORDER_NOTIFY: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.ORDER_NOTIFY;
            break;
            case OTHER: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.OTHER;
            break;
            case OTHER_REGULATED_MATERIAL_DOMESTIC: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.OTHER_REGULATED_MATERIAL_DOMESTIC;
            break;
            case PACKAGE_RETURN_PROGRAM: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.PACKAGE_RETURN_PROGRAM;
            break;
            case PIECE_COUNT_VERIFICATION: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.PIECE_COUNT_VERIFICATION;
            break;
            case POISON: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.POISON;
            break;
            case PREPAID: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.PREPAID;
            break;
            case PRIORITY_ALERT: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.PRIORITY_ALERT;
            break;
            case PRIORITY_ALERT_PLUS: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.PRIORITY_ALERT_PLUS;
            break;
            case PROTECTION_FROM_FREEZING: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.PROTECTION_FROM_FREEZING;
            break;
            case RAIL_MODE: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.RAIL_MODE;
            break;
            case RECONSIGNMENT_CHARGES: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.RECONSIGNMENT_CHARGES;
            break;
            case REROUTE_CROSS_COUNTRY_DEFERRED: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.REROUTE_CROSS_COUNTRY_DEFERRED;
            break;
            case REROUTE_CROSS_COUNTRY_EXPEDITED: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.REROUTE_CROSS_COUNTRY_EXPEDITED;
            break;
            case REROUTE_LOCAL: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.REROUTE_LOCAL;
            break;
            case RESIDENTIAL_DELIVERY: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.RESIDENTIAL_DELIVERY;
            break;
            case RESIDENTIAL_PICKUP: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.RESIDENTIAL_PICKUP;
            break;
            case RETURNS_CLEARANCE: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.RETURNS_CLEARANCE;
            break;
            case RETURNS_CLEARANCE_SPECIAL_ROUTING_REQUIRED: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.RETURNS_CLEARANCE_SPECIAL_ROUTING_REQUIRED;
            break;
            case RETURN_MANAGER: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.RETURN_MANAGER;
            break;
            case SATURDAY_DELIVERY: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.SATURDAY_DELIVERY;
            break;
            case SHIPMENT_PLACED_IN_COLD_STORAGE: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.SHIPMENT_PLACED_IN_COLD_STORAGE;
            break;
            case SINGLE_SHIPMENT: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.SINGLE_SHIPMENT;
            break;
            case SMALL_QUANTITY_EXCEPTION: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.SMALL_QUANTITY_EXCEPTION;
            break;
            case SORT_AND_SEGREGATE: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.SORT_AND_SEGREGATE;
            break;
            case SPECIAL_DELIVERY: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.SPECIAL_DELIVERY;
            break;
            case SPECIAL_EQUIPMENT: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.SPECIAL_EQUIPMENT;
            break;
            case STANDARD_GROUND_SERVICE: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.STANDARD_GROUND_SERVICE;
            break;
            case STORAGE: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.STORAGE;
            break;
            case SUNDAY_DELIVERY: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.SUNDAY_DELIVERY;
            break;
            case THIRD_PARTY_BILLING: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.THIRD_PARTY_BILLING;
            break;
            case THIRD_PARTY_CONSIGNEE: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.THIRD_PARTY_CONSIGNEE;
            break;
            case TOP_LOAD: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.TOP_LOAD;
            break;
            case WEEKEND_DELIVERY: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.WEEKEND_DELIVERY;
            break;
            case WEEKEND_PICKUP: trackSpecialHandlingType_ = com.demo.domain.TrackSpecialHandlingType.WEEKEND_PICKUP;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return trackSpecialHandlingType_;
    }
    @Override
    public com.demo.domain.Money map(Money value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.Money money___ = new com.demo.domain.Money();

        money___.setCurrency( map( value.getCurrency() ) );
        money___.setAmount( value.getAmount() );

        return money___;
    }

    @Override
    public com.demo.domain.TrackReturnLabelType map(TrackReturnLabelType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.TrackReturnLabelType trackReturnLabelType_;

        switch ( value ) {
            case EMAIL: trackReturnLabelType_ = com.demo.domain.TrackReturnLabelType.EMAIL;
            break;
            case PRINT: trackReturnLabelType_ = com.demo.domain.TrackReturnLabelType.PRINT;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return trackReturnLabelType_;
    }
    @Override
    public com.demo.domain.TrackPaymentType map(TrackPaymentType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.TrackPaymentType trackPaymentType__;

        switch ( value ) {
            case CASH_OR_CHECK_AT_DESTINATION: trackPaymentType__ = com.demo.domain.TrackPaymentType.CASH_OR_CHECK_AT_DESTINATION;
            break;
            case CASH_OR_CHECK_AT_ORIGIN: trackPaymentType__ = com.demo.domain.TrackPaymentType.CASH_OR_CHECK_AT_ORIGIN;
            break;
            case CREDIT_CARD_AT_DESTINATION: trackPaymentType__ = com.demo.domain.TrackPaymentType.CREDIT_CARD_AT_DESTINATION;
            break;
            case CREDIT_CARD_AT_ORIGIN: trackPaymentType__ = com.demo.domain.TrackPaymentType.CREDIT_CARD_AT_ORIGIN;
            break;
            case OTHER: trackPaymentType__ = com.demo.domain.TrackPaymentType.OTHER;
            break;
            case RECIPIENT_ACCOUNT: trackPaymentType__ = com.demo.domain.TrackPaymentType.RECIPIENT_ACCOUNT;
            break;
            case SHIPPER_ACCOUNT: trackPaymentType__ = com.demo.domain.TrackPaymentType.SHIPPER_ACCOUNT;
            break;
            case THIRD_PARTY_ACCOUNT: trackPaymentType__ = com.demo.domain.TrackPaymentType.THIRD_PARTY_ACCOUNT;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return trackPaymentType__;
    }
    @Override
    public com.demo.domain.TrackChargesPaymentClassificationType map(TrackChargesPaymentClassificationType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.TrackChargesPaymentClassificationType trackChargesPaymentClassificationType_;

        switch ( value ) {
            case DUTIES_AND_TAXES: trackChargesPaymentClassificationType_ = com.demo.domain.TrackChargesPaymentClassificationType.DUTIES_AND_TAXES;
            break;
            case TRANSPORTATION: trackChargesPaymentClassificationType_ = com.demo.domain.TrackChargesPaymentClassificationType.TRANSPORTATION;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return trackChargesPaymentClassificationType_;
    }
    @Override
    public com.demo.domain.TrackingDateOrTimestampType map(TrackingDateOrTimestampType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.TrackingDateOrTimestampType trackingDateOrTimestampType_;

        switch ( value ) {
            case ACTUAL_DELIVERY: trackingDateOrTimestampType_ = com.demo.domain.TrackingDateOrTimestampType.ACTUAL_DELIVERY;
            break;
            case ACTUAL_PICKUP: trackingDateOrTimestampType_ = com.demo.domain.TrackingDateOrTimestampType.ACTUAL_PICKUP;
            break;
            case ACTUAL_TENDER: trackingDateOrTimestampType_ = com.demo.domain.TrackingDateOrTimestampType.ACTUAL_TENDER;
            break;
            case ANTICIPATED_TENDER: trackingDateOrTimestampType_ = com.demo.domain.TrackingDateOrTimestampType.ANTICIPATED_TENDER;
            break;
            case APPOINTMENT_DELIVERY: trackingDateOrTimestampType_ = com.demo.domain.TrackingDateOrTimestampType.APPOINTMENT_DELIVERY;
            break;
            case ESTIMATED_DELIVERY: trackingDateOrTimestampType_ = com.demo.domain.TrackingDateOrTimestampType.ESTIMATED_DELIVERY;
            break;
            case ESTIMATED_PICKUP: trackingDateOrTimestampType_ = com.demo.domain.TrackingDateOrTimestampType.ESTIMATED_PICKUP;
            break;
            case SHIP: trackingDateOrTimestampType_ = com.demo.domain.TrackingDateOrTimestampType.SHIP;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return trackingDateOrTimestampType_;
    }
    @Override
    public com.demo.domain.DistanceUnits map(DistanceUnits value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.DistanceUnits distanceUnits_;

        switch ( value ) {
            case KM: distanceUnits_ = com.demo.domain.DistanceUnits.KM;
            break;
            case MI: distanceUnits_ = com.demo.domain.DistanceUnits.MI;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return distanceUnits_;
    }
    @Override
    public com.demo.domain.TrackDeliveryOptionType map(TrackDeliveryOptionType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.TrackDeliveryOptionType trackDeliveryOptionType_;

        switch ( value ) {
            case APPOINTMENT: trackDeliveryOptionType_ = com.demo.domain.TrackDeliveryOptionType.APPOINTMENT;
            break;
            case DATE_CERTAIN: trackDeliveryOptionType_ = com.demo.domain.TrackDeliveryOptionType.DATE_CERTAIN;
            break;
            case ELECTRONIC_SIGNATURE_RELEASE: trackDeliveryOptionType_ = com.demo.domain.TrackDeliveryOptionType.ELECTRONIC_SIGNATURE_RELEASE;
            break;
            case EVENING: trackDeliveryOptionType_ = com.demo.domain.TrackDeliveryOptionType.EVENING;
            break;
            case REDIRECT_TO_HOLD_AT_LOCATION: trackDeliveryOptionType_ = com.demo.domain.TrackDeliveryOptionType.REDIRECT_TO_HOLD_AT_LOCATION;
            break;
            case REROUTE: trackDeliveryOptionType_ = com.demo.domain.TrackDeliveryOptionType.REROUTE;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return trackDeliveryOptionType_;
    }
    @Override
    public com.demo.domain.PieceCountLocationType map(PieceCountLocationType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.PieceCountLocationType pieceCountLocationType_;

        switch ( value ) {
            case DESTINATION: pieceCountLocationType_ = com.demo.domain.PieceCountLocationType.DESTINATION;
            break;
            case ORIGIN: pieceCountLocationType_ = com.demo.domain.PieceCountLocationType.ORIGIN;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return pieceCountLocationType_;
    }
    @Override
    public com.demo.domain.AvailableImageType map(AvailableImageType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.AvailableImageType availableImageType_;

        switch ( value ) {
            case BILL_OF_LADING: availableImageType_ = com.demo.domain.AvailableImageType.BILL_OF_LADING;
            break;
            case SIGNATURE_PROOF_OF_DELIVERY: availableImageType_ = com.demo.domain.AvailableImageType.SIGNATURE_PROOF_OF_DELIVERY;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return availableImageType_;
    }
    @Override
    public com.demo.domain.DeliveryOptionType map(DeliveryOptionType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.DeliveryOptionType deliveryOptionType_;

        switch ( value ) {
            case INDIRECT_SIGNATURE_RELEASE: deliveryOptionType_ = com.demo.domain.DeliveryOptionType.INDIRECT_SIGNATURE_RELEASE;
            break;
            case REDIRECT_TO_HOLD_AT_LOCATION: deliveryOptionType_ = com.demo.domain.DeliveryOptionType.REDIRECT_TO_HOLD_AT_LOCATION;
            break;
            case REROUTE: deliveryOptionType_ = com.demo.domain.DeliveryOptionType.REROUTE;
            break;
            case RESCHEDULE: deliveryOptionType_ = com.demo.domain.DeliveryOptionType.RESCHEDULE;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return deliveryOptionType_;
    }
    @Override
    public com.demo.domain.ArrivalLocationType map(ArrivalLocationType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.ArrivalLocationType arrivalLocationType_;

        switch ( value ) {
            case AIRPORT: arrivalLocationType_ = com.demo.domain.ArrivalLocationType.AIRPORT;
            break;
            case CUSTOMER: arrivalLocationType_ = com.demo.domain.ArrivalLocationType.CUSTOMER;
            break;
            case CUSTOMS_BROKER: arrivalLocationType_ = com.demo.domain.ArrivalLocationType.CUSTOMS_BROKER;
            break;
            case DELIVERY_LOCATION: arrivalLocationType_ = com.demo.domain.ArrivalLocationType.DELIVERY_LOCATION;
            break;
            case DESTINATION_AIRPORT: arrivalLocationType_ = com.demo.domain.ArrivalLocationType.DESTINATION_AIRPORT;
            break;
            case DESTINATION_FEDEX_FACILITY: arrivalLocationType_ = com.demo.domain.ArrivalLocationType.DESTINATION_FEDEX_FACILITY;
            break;
            case DROP_BOX: arrivalLocationType_ = com.demo.domain.ArrivalLocationType.DROP_BOX;
            break;
            case ENROUTE: arrivalLocationType_ = com.demo.domain.ArrivalLocationType.ENROUTE;
            break;
            case FEDEX_FACILITY: arrivalLocationType_ = com.demo.domain.ArrivalLocationType.FEDEX_FACILITY;
            break;
            case FEDEX_OFFICE_LOCATION: arrivalLocationType_ = com.demo.domain.ArrivalLocationType.FEDEX_OFFICE_LOCATION;
            break;
            case INTERLINE_CARRIER: arrivalLocationType_ = com.demo.domain.ArrivalLocationType.INTERLINE_CARRIER;
            break;
            case NON_FEDEX_FACILITY: arrivalLocationType_ = com.demo.domain.ArrivalLocationType.NON_FEDEX_FACILITY;
            break;
            case ORIGIN_AIRPORT: arrivalLocationType_ = com.demo.domain.ArrivalLocationType.ORIGIN_AIRPORT;
            break;
            case ORIGIN_FEDEX_FACILITY: arrivalLocationType_ = com.demo.domain.ArrivalLocationType.ORIGIN_FEDEX_FACILITY;
            break;
            case PICKUP_LOCATION: arrivalLocationType_ = com.demo.domain.ArrivalLocationType.PICKUP_LOCATION;
            break;
            case PLANE: arrivalLocationType_ = com.demo.domain.ArrivalLocationType.PLANE;
            break;
            case PORT_OF_ENTRY: arrivalLocationType_ = com.demo.domain.ArrivalLocationType.PORT_OF_ENTRY;
            break;
            case SHIP_AND_GET_LOCATION: arrivalLocationType_ = com.demo.domain.ArrivalLocationType.SHIP_AND_GET_LOCATION;
            break;
            case SORT_FACILITY: arrivalLocationType_ = com.demo.domain.ArrivalLocationType.SORT_FACILITY;
            break;
            case TURNPOINT: arrivalLocationType_ = com.demo.domain.ArrivalLocationType.TURNPOINT;
            break;
            case VEHICLE: arrivalLocationType_ = com.demo.domain.ArrivalLocationType.VEHICLE;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return arrivalLocationType_;
    }
    @Override
    public com.demo.domain.NotificationParameter map(NotificationParameter value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.NotificationParameter notificationParameter_ = new com.demo.domain.NotificationParameter();

        notificationParameter_.setId( map( value.getId() ) );
        notificationParameter_.setValue( map( value.getValue() ) );

        return notificationParameter_;
    }

    @Override
    public com.demo.domain.StringBarcodeType map(StringBarcodeType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.StringBarcodeType stringBarcodeType_;

        switch ( value ) {
            case ADDRESS: stringBarcodeType_ = com.demo.domain.StringBarcodeType.ADDRESS;
            break;
            case ASTRA: stringBarcodeType_ = com.demo.domain.StringBarcodeType.ASTRA;
            break;
            case FEDEX_1_D: stringBarcodeType_ = com.demo.domain.StringBarcodeType.FEDEX_1_D;
            break;
            case GROUND: stringBarcodeType_ = com.demo.domain.StringBarcodeType.GROUND;
            break;
            case POSTAL: stringBarcodeType_ = com.demo.domain.StringBarcodeType.POSTAL;
            break;
            case USPS: stringBarcodeType_ = com.demo.domain.StringBarcodeType.USPS;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return stringBarcodeType_;
    }
    @Override
    public com.demo.domain.TrackStatusAncillaryDetail map(TrackStatusAncillaryDetail value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.TrackStatusAncillaryDetail trackStatusAncillaryDetail_ = new com.demo.domain.TrackStatusAncillaryDetail();

        trackStatusAncillaryDetail_.setReason( map( value.getReason() ) );
        trackStatusAncillaryDetail_.setReasonDescription( map( value.getReasonDescription() ) );
        trackStatusAncillaryDetail_.setAction( map( value.getAction() ) );
        trackStatusAncillaryDetail_.setActionDescription( map( value.getActionDescription() ) );

        return trackStatusAncillaryDetail_;
    }

    @Override
    public com.demo.domain.TrackIdentifierType map(TrackIdentifierType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.TrackIdentifierType trackIdentifierType_;

        switch ( value ) {
            case BILL_OF_LADING: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.BILL_OF_LADING;
            break;
            case COD_RETURN_TRACKING_NUMBER: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.COD_RETURN_TRACKING_NUMBER;
            break;
            case CUSTOMER_AUTHORIZATION_NUMBER: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.CUSTOMER_AUTHORIZATION_NUMBER;
            break;
            case CUSTOMER_REFERENCE: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.CUSTOMER_REFERENCE;
            break;
            case DEPARTMENT: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.DEPARTMENT;
            break;
            case DOCUMENT_AIRWAY_BILL: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.DOCUMENT_AIRWAY_BILL;
            break;
            case FREE_FORM_REFERENCE: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.FREE_FORM_REFERENCE;
            break;
            case GROUND_INTERNATIONAL: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.GROUND_INTERNATIONAL;
            break;
            case GROUND_SHIPMENT_ID: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.GROUND_SHIPMENT_ID;
            break;
            case GROUP_MPS: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.GROUP_MPS;
            break;
            case INVOICE: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.INVOICE;
            break;
            case JOB_GLOBAL_TRACKING_NUMBER: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.JOB_GLOBAL_TRACKING_NUMBER;
            break;
            case ORDER_GLOBAL_TRACKING_NUMBER: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.ORDER_GLOBAL_TRACKING_NUMBER;
            break;
            case ORDER_TO_PAY_NUMBER: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.ORDER_TO_PAY_NUMBER;
            break;
            case OUTBOUND_LINK_TO_RETURN: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.OUTBOUND_LINK_TO_RETURN;
            break;
            case PARTNER_CARRIER_NUMBER: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.PARTNER_CARRIER_NUMBER;
            break;
            case PART_NUMBER: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.PART_NUMBER;
            break;
            case PURCHASE_ORDER: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.PURCHASE_ORDER;
            break;
            case REROUTE_TRACKING_NUMBER: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.REROUTE_TRACKING_NUMBER;
            break;
            case RETURNED_TO_SHIPPER_TRACKING_NUMBER: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.RETURNED_TO_SHIPPER_TRACKING_NUMBER;
            break;
            case RETURN_MATERIALS_AUTHORIZATION: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.RETURN_MATERIALS_AUTHORIZATION;
            break;
            case SHIPPER_REFERENCE: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.SHIPPER_REFERENCE;
            break;
            case STANDARD_MPS: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.STANDARD_MPS;
            break;
            case TRACKING_NUMBER_OR_DOORTAG: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.TRACKING_NUMBER_OR_DOORTAG;
            break;
            case TRANSPORTATION_CONTROL_NUMBER: trackIdentifierType_ = com.demo.domain.TrackIdentifierType.TRANSPORTATION_CONTROL_NUMBER;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return trackIdentifierType_;
    }
    @Override
    public com.demo.domain.NaftaCommodityDetail map(NaftaCommodityDetail value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.NaftaCommodityDetail naftaCommodityDetail_ = new com.demo.domain.NaftaCommodityDetail();

        naftaCommodityDetail_.setPreferenceCriterion( map( value.getPreferenceCriterion() ) );
        naftaCommodityDetail_.setProducerDetermination( map( value.getProducerDetermination() ) );
        naftaCommodityDetail_.setProducerId( map( value.getProducerId() ) );
        naftaCommodityDetail_.setNetCostMethod( map( value.getNetCostMethod() ) );
        naftaCommodityDetail_.setNetCostDateRange( map( value.getNetCostDateRange() ) );

        return naftaCommodityDetail_;
    }

    @Override
    public com.demo.domain.SpecialInstructionStatusDetail map(SpecialInstructionStatusDetail value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.SpecialInstructionStatusDetail specialInstructionStatusDetail_ = new com.demo.domain.SpecialInstructionStatusDetail();

        specialInstructionStatusDetail_.setStatus( map( value.getStatus() ) );
        specialInstructionStatusDetail_.setStatusCreateTime( value.getStatusCreateTime() );

        return specialInstructionStatusDetail_;
    }

    @Override
    public com.demo.domain.ImageSizeType map(ImageSizeType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.ImageSizeType imageSizeType_;

        switch ( value ) {
            case LARGE: imageSizeType_ = com.demo.domain.ImageSizeType.LARGE;
            break;
            case SMALL: imageSizeType_ = com.demo.domain.ImageSizeType.SMALL;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return imageSizeType_;
    }
    @Override
    public com.demo.domain.EligibilityType map(EligibilityType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.EligibilityType eligibilityType_;

        switch ( value ) {
            case ELIGIBLE: eligibilityType_ = com.demo.domain.EligibilityType.ELIGIBLE;
            break;
            case INELIGIBLE: eligibilityType_ = com.demo.domain.EligibilityType.INELIGIBLE;
            break;
            case POSSIBLY_ELIGIBLE: eligibilityType_ = com.demo.domain.EligibilityType.POSSIBLY_ELIGIBLE;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return eligibilityType_;
    }
    @Override
    public List<com.demo.domain.Measure> map27(List<Measure> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.Measure> list_ = new ArrayList<com.demo.domain.Measure>();
        for ( Measure measure : value ) {
            list_.add( map( measure ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.Measure map(Measure value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.Measure measure_ = new com.demo.domain.Measure();

        measure_.setQuantity( value.getQuantity() );
        measure_.setUnits( map( value.getUnits() ) );

        return measure_;
    }

    @Override
    public com.demo.domain.AppointmentDetail map(AppointmentDetail value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.AppointmentDetail appointmentDetail_ = new com.demo.domain.AppointmentDetail();

        appointmentDetail_.setDate( value.getDate() );
        if ( appointmentDetail_.getWindowDetails() != null ) {
            Collection<com.demo.domain.AppointmentTimeDetail> targetCollection = map29( value.getWindowDetails() );
            if ( targetCollection != null ) {
                appointmentDetail_.getWindowDetails().addAll( targetCollection );
            }
        }

        return appointmentDetail_;
    }

    @Override
    public com.demo.domain.NaftaPreferenceCriterionCode map(NaftaPreferenceCriterionCode value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.NaftaPreferenceCriterionCode naftaPreferenceCriterionCode_;

        switch ( value ) {
            case A: naftaPreferenceCriterionCode_ = com.demo.domain.NaftaPreferenceCriterionCode.A;
            break;
            case B: naftaPreferenceCriterionCode_ = com.demo.domain.NaftaPreferenceCriterionCode.B;
            break;
            case C: naftaPreferenceCriterionCode_ = com.demo.domain.NaftaPreferenceCriterionCode.C;
            break;
            case D: naftaPreferenceCriterionCode_ = com.demo.domain.NaftaPreferenceCriterionCode.D;
            break;
            case E: naftaPreferenceCriterionCode_ = com.demo.domain.NaftaPreferenceCriterionCode.E;
            break;
            case F: naftaPreferenceCriterionCode_ = com.demo.domain.NaftaPreferenceCriterionCode.F;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return naftaPreferenceCriterionCode_;
    }
    @Override
    public com.demo.domain.SpecialInstructionsStatusCode map(SpecialInstructionsStatusCode value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.SpecialInstructionsStatusCode specialInstructionsStatusCode_;

        switch ( value ) {
            case ACCEPTED: specialInstructionsStatusCode_ = com.demo.domain.SpecialInstructionsStatusCode.ACCEPTED;
            break;
            case CANCELLED: specialInstructionsStatusCode_ = com.demo.domain.SpecialInstructionsStatusCode.CANCELLED;
            break;
            case DENIED: specialInstructionsStatusCode_ = com.demo.domain.SpecialInstructionsStatusCode.DENIED;
            break;
            case HELD: specialInstructionsStatusCode_ = com.demo.domain.SpecialInstructionsStatusCode.HELD;
            break;
            case MODIFIED: specialInstructionsStatusCode_ = com.demo.domain.SpecialInstructionsStatusCode.MODIFIED;
            break;
            case RELINQUISHED: specialInstructionsStatusCode_ = com.demo.domain.SpecialInstructionsStatusCode.RELINQUISHED;
            break;
            case REQUESTED: specialInstructionsStatusCode_ = com.demo.domain.SpecialInstructionsStatusCode.REQUESTED;
            break;
            case SET: specialInstructionsStatusCode_ = com.demo.domain.SpecialInstructionsStatusCode.SET;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return specialInstructionsStatusCode_;
    }
    @Override
    public List<com.demo.domain.EdtExciseCondition> map28(List<EdtExciseCondition> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.EdtExciseCondition> list_ = new ArrayList<com.demo.domain.EdtExciseCondition>();
        for ( EdtExciseCondition edtExciseCondition : value ) {
            list_.add( map( edtExciseCondition ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.EdtExciseCondition map(EdtExciseCondition value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.EdtExciseCondition edtExciseCondition_ = new com.demo.domain.EdtExciseCondition();

        edtExciseCondition_.setCategory( map( value.getCategory() ) );
        edtExciseCondition_.setValue( map( value.getValue() ) );

        return edtExciseCondition_;
    }

    @Override
    public com.demo.domain.NaftaProducerDeterminationCode map(NaftaProducerDeterminationCode value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.NaftaProducerDeterminationCode naftaProducerDeterminationCode_;

        switch ( value ) {
            case NO_1: naftaProducerDeterminationCode_ = com.demo.domain.NaftaProducerDeterminationCode.NO_1;
            break;
            case NO_2: naftaProducerDeterminationCode_ = com.demo.domain.NaftaProducerDeterminationCode.NO_2;
            break;
            case NO_3: naftaProducerDeterminationCode_ = com.demo.domain.NaftaProducerDeterminationCode.NO_3;
            break;
            case YES: naftaProducerDeterminationCode_ = com.demo.domain.NaftaProducerDeterminationCode.YES;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return naftaProducerDeterminationCode_;
    }
    @Override
    public List<com.demo.domain.AppointmentTimeDetail> map29(List<AppointmentTimeDetail> value) {
        if ( value == null ) {
            return null;
        }

        List<com.demo.domain.AppointmentTimeDetail> list_ = new ArrayList<com.demo.domain.AppointmentTimeDetail>();
        for ( AppointmentTimeDetail appointmentTimeDetail : value ) {
            list_.add( map( appointmentTimeDetail ) );
        }

        return list_;
    }

    @Override
    public com.demo.domain.AppointmentTimeDetail map(AppointmentTimeDetail value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.AppointmentTimeDetail appointmentTimeDetail_ = new com.demo.domain.AppointmentTimeDetail();

        appointmentTimeDetail_.setType( map( value.getType() ) );
        appointmentTimeDetail_.setWindow( map( value.getWindow() ) );
        appointmentTimeDetail_.setDescription( map( value.getDescription() ) );

        return appointmentTimeDetail_;
    }

    @Override
    public com.demo.domain.NaftaNetCostMethodCode map(NaftaNetCostMethodCode value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.NaftaNetCostMethodCode naftaNetCostMethodCode_;

        switch ( value ) {
            case NC: naftaNetCostMethodCode_ = com.demo.domain.NaftaNetCostMethodCode.NC;
            break;
            case NO: naftaNetCostMethodCode_ = com.demo.domain.NaftaNetCostMethodCode.NO;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return naftaNetCostMethodCode_;
    }
    @Override
    public com.demo.domain.AppointmentWindowType map(AppointmentWindowType value) {
        if ( value == null ) {
            return  null;
        }

        com.demo.domain.AppointmentWindowType appointmentWindowType_;

        switch ( value ) {
            case AFTERNOON: appointmentWindowType_ = com.demo.domain.AppointmentWindowType.AFTERNOON;
            break;
            case LATE_AFTERNOON: appointmentWindowType_ = com.demo.domain.AppointmentWindowType.LATE_AFTERNOON;
            break;
            case MID_DAY: appointmentWindowType_ = com.demo.domain.AppointmentWindowType.MID_DAY;
            break;
            case MORNING: appointmentWindowType_ = com.demo.domain.AppointmentWindowType.MORNING;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + value );
        }

        return appointmentWindowType_;
    }
    @Override
    public com.demo.domain.DateRange map(DateRange value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.DateRange dateRange_ = new com.demo.domain.DateRange();

        dateRange_.setBegins( value.getBegins() );
        dateRange_.setEnds( value.getEnds() );

        return dateRange_;
    }

    @Override
    public com.demo.domain.LocalTimeRange map(LocalTimeRange value) {
        if ( value == null ) {
            return null;
        }

        com.demo.domain.LocalTimeRange localTimeRange_ = new com.demo.domain.LocalTimeRange();

        localTimeRange_.setBegins( map( value.getBegins() ) );
        localTimeRange_.setEnds( map( value.getEnds() ) );

        return localTimeRange_;
    }
}
