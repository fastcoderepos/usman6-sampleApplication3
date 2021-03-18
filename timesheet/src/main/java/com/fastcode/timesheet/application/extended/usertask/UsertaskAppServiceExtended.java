package com.fastcode.timesheet.application.extended.usertask;

import com.fastcode.timesheet.application.core.usertask.UsertaskAppService;
import com.fastcode.timesheet.commons.logging.LoggingHelper;
import com.fastcode.timesheet.domain.extended.authorization.users.IUsersRepositoryExtended;
import com.fastcode.timesheet.domain.extended.task.ITaskRepositoryExtended;
import com.fastcode.timesheet.domain.extended.usertask.IUsertaskRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("usertaskAppServiceExtended")
public class UsertaskAppServiceExtended extends UsertaskAppService implements IUsertaskAppServiceExtended {

    public UsertaskAppServiceExtended(
        IUsertaskRepositoryExtended usertaskRepositoryExtended,
        ITaskRepositoryExtended taskRepositoryExtended,
        IUsersRepositoryExtended usersRepositoryExtended,
        IUsertaskMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(usertaskRepositoryExtended, taskRepositoryExtended, usersRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
