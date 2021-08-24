package website.invention.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

interface Banner{
    String getFirstName();
    String getLastName();
    String getEmailId();
}


@Model(adaptables = Resource.class)
public class BannerComponent implements Banner{

    @ValueMapValue
            @Default(values = "Enter the first name here")
    String fname;

    @ValueMapValue
            @Default(values = "Enter your last name here")
    String lname;

    @ValueMapValue
            @Default(values = "Enter your email here")
    String email;


    @Override
    public String getFirstName() {
        return fname;
    }

    @Override
    public String getLastName() {
        return lname;
    }

    @Override
    public String getEmailId() {
        return email;
    }
}
