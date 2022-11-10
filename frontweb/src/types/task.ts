import {Project} from './project';
import {User} from './user';

export type Task = {
    id: number,
    name: string;
    description: string;
    dataInitial: string;
    dueData: string;
    status:string;
    userId: number;
    userName: string;
    projectId: number;
    projectName: string;
};