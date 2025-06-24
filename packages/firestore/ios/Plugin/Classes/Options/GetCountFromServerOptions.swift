import Foundation

@objc public class GetCountFromServerOptions: NSObject {
    private let reference: String
    private let compositeFilter: QueryCompositeFilterConstraint?

    init(reference: String, compositeFilter: JSObject?) {
        self.reference = reference
        self.compositeFilter = FirebaseFirestoreHelper.createQueryCompositeFilterConstraintFromJSObject(compositeFilter)
    }

    func getReference() -> String {
        return reference
    }
    
    func getCompositeFilter() -> QueryCompositeFilterConstraint? {
        return compositeFilter
    }
}
