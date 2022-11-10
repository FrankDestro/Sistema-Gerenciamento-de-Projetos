import {Role} from './role';

export type User = {
    id: number;
    firstName: string;
    lastName: string;
    email: string;
    imgProfile: string;
    charge: string;
    roles: Role []
};