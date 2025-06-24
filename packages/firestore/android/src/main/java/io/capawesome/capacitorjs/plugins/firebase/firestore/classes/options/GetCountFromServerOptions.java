package io.capawesome.capacitorjs.plugins.firebase.firestore.classes.options;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.getcapacitor.JSObject;

import org.json.JSONException;

import io.capawesome.capacitorjs.plugins.firebase.firestore.FirebaseFirestoreHelper;
import io.capawesome.capacitorjs.plugins.firebase.firestore.classes.constraints.QueryCompositeFilterConstraint;

public class GetCountFromServerOptions {

    @NonNull
    private final String reference;

    @Nullable
    private final QueryCompositeFilterConstraint compositeFilter;


    public GetCountFromServerOptions(@NonNull String reference,
                                     @Nullable JSObject compositeFilter) throws JSONException {
        this.reference = reference;
        this.compositeFilter = FirebaseFirestoreHelper.createQueryCompositeFilterConstraintFromJSObject(compositeFilter);
    }

    @NonNull
    public String getReference() {
        return reference;
    }

    @Nullable
    public QueryCompositeFilterConstraint getCompositeFilter() {
        return compositeFilter;
    }
}
